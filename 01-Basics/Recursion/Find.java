import java.util.ArrayList;
import java.util.HashMap;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 5, 7};
        boolean ans = isPresent(arr, 7, 0);
        int ans2 = findIndex(arr, 7, 0);
        int ans3 = findIndexLast(arr, 5, arr.length-1);
        findAllIndex(arr, 7, 1);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(list);
    }

    static boolean isPresent(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || isPresent(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

        static ArrayList<Integer> list = new ArrayList<Integer>();

        static void findAllIndex ( int[] arr, int target, int index){
            if (index == arr.length) {
                return;
            }
            if (arr[index] == target) {
                list.add(index);
            }
            findAllIndex(arr, target, index + 1);
        }
    }
