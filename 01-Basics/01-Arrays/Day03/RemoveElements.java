import java.util.Arrays;

public class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }

        return x;
    }

    public static void main(String[] args) {

        RemoveElements obj = new RemoveElements();

        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("Number of elements after removing " + val + ": " + k);

        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}