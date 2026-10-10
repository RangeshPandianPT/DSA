/**
 * Max Sum Subarray of Size K
 * Sliding Window Pattern
 */
public class MaxSumSubarrayOfSizeK {

    public int maximumSumSubarray(int k, int[] arr) {
        // TODO: Implement your sliding window solution here
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // Add the next element to the window
            windowSum += arr[windowEnd];
            
            // Slide the window if we've hit the size k
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++;                 // slide the window ahead
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSubarrayOfSizeK solution = new MaxSumSubarrayOfSizeK();
        
        // Test cases
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println("Test Case 1: " + solution.maximumSumSubarray(k1, arr1)); // Expected: 9 (subarray [5, 1, 3])

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println("Test Case 2: " + solution.maximumSumSubarray(k2, arr2)); // Expected: 7 (subarray [3, 4])
    }
}
