import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }

        return x + 1;
    }

    public static void main(String[] args) {

        RemoveDuplicates obj = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}