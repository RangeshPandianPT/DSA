/**
 * Minimum Size Subarray Sum (LeetCode 209)
 * Sliding Window Pattern
 */
public class MinSubarrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        // TODO: Implement your sliding window solution here
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // add the next element

            // Shrink the window as small as possible until the windowSum is smaller than target
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart]; // subtract the element going out
                windowStart++;                  // slide the window ahead
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        MinSubarrayLen solution = new MinSubarrayLen();
        
        // Test cases
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Test Case 1: " + solution.minSubArrayLen(target1, nums1)); // Expected: 2 (subarray [4, 3])

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println("Test Case 2: " + solution.minSubArrayLen(target2, nums2)); // Expected: 1 (subarray [4])
    }
}
