import java.util.Arrays;

/**
 * Demonstrates the Two Pointers algorithmic pattern.
 * Two Pointers is used typically on sorted arrays, linked lists, or strings to search for pairs
 * or process elements from both ends (Opposite Direction) or moving at different speeds (Same Direction).
 */
public class TwoPointersBasics {

    /**
     * Pattern 1: Opposite Direction (Left & Right Pointers)
     * Finds two numbers in a sorted array that add up to the target sum.
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static int[] twoSumSorted(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed as per standard LeetCode Two Sum II
            } else if (currentSum < target) {
                left++; // Need a larger sum
            } else {
                right--; // Need a smaller sum
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * Pattern 2: Opposite Direction (Palindrome Check)
     * Verifies if a string is a palindrome by comparing alphanumeric characters from both ends.
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Two Pointers Basics Demonstration ---");

        // Test Two Sum Sorted
        int[] sortedArray = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSumSorted(sortedArray, target);
        System.out.println("Two Sum Sorted on " + Arrays.toString(sortedArray) + " (Target " + target + "): Indices -> " + Arrays.toString(res));

        // Test Palindrome Check
        String testStr = "A man, a plan, a canal: Panama";
        boolean isPal = isPalindrome(testStr);
        System.out.println("Is Palindrome (\"" + testStr + "\"): " + isPal);
    }
}
