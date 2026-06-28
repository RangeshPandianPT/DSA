
import java.util.Arrays;

public class MaximumElementAfterDecrementingAndRearranging {

    static class Solution {

        public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

            // Sort the array
            Arrays.sort(arr);

            // First element must be 1
            arr[0] = 1;

            // Ensure difference between adjacent elements is at most 1
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Math.min(arr[i], arr[i - 1] + 1);
            }

            // Return the maximum element
            return arr[arr.length - 1];
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {2, 2, 1, 2, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int result = solution.maximumElementAfterDecrementingAndRearranging(arr);

        System.out.println("Modified Array: " + Arrays.toString(arr));
        System.out.println("Maximum Element: " + result);
    }
}