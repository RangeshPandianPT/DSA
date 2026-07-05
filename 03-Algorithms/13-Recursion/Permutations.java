import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void generatePermutations(int[] arr, int index, List<List<Integer>> result) {
        if (index == arr.length - 1) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1, result);
            swap(arr, index, i); // Backtrack
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        
        generatePermutations(arr, 0, result);
        
        System.out.println("Permutations of array: ");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
