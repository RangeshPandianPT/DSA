import java.util.Arrays;

/**
 * Competitive Programming / Contest Problem Simulation
 * Contest: LeetCode Weekly Contest Simulation
 * Problem: Special Array With X Elements Greater Than or Equal X (LeetCode 1608)
 *
 * Problem Statement:
 * You are given an array nums of non-negative integers. nums is considered special
 * if there exists a number x such that there are exactly x numbers in nums that are
 * greater than or equal to x. Notice that x does not have to be an element in nums.
 * Return x if the array is special, otherwise return -1.
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 *
 * Approaches:
 * 1. Counting / Suffix Sum Array: O(N) time, O(N) space.
 * 2. Binary Search on X in range [1, N]: O(N log N) time, O(1) space.
 */
public class WeeklyContest_SpecialArray {

    /**
     * Optimal Counting Array solution.
     * Computes the count of numbers >= x in linear O(N) time.
     *
     * @param nums Array of non-negative numbers
     * @return Special value x, or -1 if none exists
     */
    public static int specialArray(int[] nums) {
        int n = nums.length;
        // count[k] stores how many elements equal k, with count[n] storing elements >= n
        int[] count = new int[n + 1];

        for (int num : nums) {
            if (num >= n) {
                count[n]++;
            } else {
                count[num]++;
            }
        }

        // Suffix sum: total numbers >= current candidate x
        int totalGreaterOrEqual = 0;
        for (int x = n; x >= 0; x--) {
            totalGreaterOrEqual += count[x];
            if (totalGreaterOrEqual == x) {
                return x;
            }
        }

        return -1;
    }

    /**
     * Binary Search Approach.
     * Sorts array and applies binary search over x in [1, nums.length].
     *
     * Time Complexity: O(N log N)
     * Space Complexity: O(1)
     */
    public static int specialArrayBinarySearch(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int x = 1; x <= n; x++) {
            // Find first index where nums[index] >= x using binary search
            int low = 0, high = n - 1, firstIndex = n;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] >= x) {
                    firstIndex = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int count = n - firstIndex;
            if (count == x) {
                return x;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println("=================================================");
        System.out.println("  Contest Problem: Special Array With X Elements");
        System.out.println("=================================================");

        // Test Case 1: [3, 5] -> 2 numbers >= 2 -> Expected: 2
        int[] test1 = {3, 5};
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("  -> Counting: " + specialArray(test1) + " (Expected: 2)");
        System.out.println("  -> BS:       " + specialArrayBinarySearch(test1.clone()) + " (Expected: 2)");

        // Test Case 2: [0, 0] -> No valid x -> Expected: -1
        int[] test2 = {0, 0};
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("  -> Counting: " + specialArray(test2) + " (Expected: -1)");
        System.out.println("  -> BS:       " + specialArrayBinarySearch(test2.clone()) + " (Expected: -1)");

        // Test Case 3: [0, 4, 3, 0, 4] -> 3 numbers >= 3 -> Expected: 3
        int[] test3 = {0, 4, 3, 0, 4};
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("  -> Counting: " + specialArray(test3) + " (Expected: 3)");
        System.out.println("  -> BS:       " + specialArrayBinarySearch(test3.clone()) + " (Expected: 3)");

        long endTime = System.currentTimeMillis();
        System.out.println("-------------------------------------------------");
        System.out.println("Contest Simulation Finished in: " + (endTime - startTime) + " ms");
    }
}
