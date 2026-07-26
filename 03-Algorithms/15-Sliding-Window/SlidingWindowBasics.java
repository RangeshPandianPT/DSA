import java.util.Arrays;

/**
 * Demonstrates the Sliding Window algorithmic pattern.
 * Used for array or string subarray/substring problems to avoid redundant calculations
 * by maintaining a window of elements that slides across the collection.
 */
public class SlidingWindowBasics {

    /**
     * Pattern 1: Fixed Size Window
     * Finds the maximum sum of any contiguous subarray of size K.
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static int maxSumSubarrayOfSizeK(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1;
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Calculate initial window sum of first K elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window: subtract the element leaving the window and add the new element entering
        for (int end = k; end < arr.length; end++) {
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    /**
     * Pattern 2: Variable Size Window
     * Finds the length of the smallest contiguous subarray whose sum is greater than or equal to S.
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            // Shrink window from the left as long as the condition is satisfied
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        System.out.println("--- Sliding Window Basics Demonstration ---");

        // Test Fixed Size Window
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = maxSumSubarrayOfSizeK(arr1, k);
        System.out.println("Max sum of subarray of size " + k + " in " + Arrays.toString(arr1) + " -> " + maxSum);

        // Test Variable Size Window
        int[] arr2 = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minLen = minSubArrayLen(target, arr2);
        System.out.println("Min length of subarray with sum >= " + target + " in " + Arrays.toString(arr2) + " -> " + minLen);
    }
}
