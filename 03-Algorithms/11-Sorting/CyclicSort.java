import java.util.Arrays;

/**
 * Cyclic Sort Algorithm
 * Given an array containing numbers from 1 to N (or 0 to N-1), sort the array in O(N) time and O(1) space.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class CyclicSort {

    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // Assuming 1 to N range
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        System.out.println("Before Cyclic Sort: " + Arrays.toString(nums));
        
        cyclicSort(nums);
        
        System.out.println("After Cyclic Sort : " + Arrays.toString(nums));
    }
}
