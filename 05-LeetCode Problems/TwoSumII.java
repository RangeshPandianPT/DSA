/**
 * LeetCode 167 - Two Sum II - Input Array Is Sorted (Medium)
 * Topic: Two Pointers
 *
 * Problem: Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                return new int[] {left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[] {-1, -1}; // Should not reach here per problem description
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 167: Two Sum II ---");
        
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Input: " + Arrays.toString(numbers1) + ", Target: " + target1);
        System.out.println("Output: " + Arrays.toString(twoSum(numbers1, target1))); // Expected: [1, 2]
        
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        System.out.println("Input: " + Arrays.toString(numbers2) + ", Target: " + target2);
        System.out.println("Output: " + Arrays.toString(twoSum(numbers2, target2))); // Expected: [1, 3]
    }
}
