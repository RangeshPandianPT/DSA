package LeetCode;

import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        SortedSquares sq = new SortedSquares();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sq.sortedSquares(nums);

        System.out.println("Sorted Squares:");
        System.out.println(Arrays.toString(result));
    }
}