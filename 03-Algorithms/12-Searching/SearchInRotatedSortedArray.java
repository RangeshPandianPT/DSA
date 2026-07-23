import java.util.Arrays;

/**
 * LeetCode 33 - Search in Rotated Sorted Array
 * Given an integer array nums sorted in ascending order (with distinct values) that is rotated at an unknown pivot index,
 * return the index of target if it is in nums, or -1 if it is not.
 * 
 * Time Complexity: O(log N) Modified Binary Search
 * Space Complexity: O(1)
 */
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Otherwise, right half must be sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int target2 = 3;

        System.out.println("Array : " + Arrays.toString(nums));
        System.out.println("Index of " + target1 + ": " + search(nums, target1)); // Expected 4
        System.out.println("Index of " + target2 + ": " + search(nums, target2)); // Expected -1
    }
}
