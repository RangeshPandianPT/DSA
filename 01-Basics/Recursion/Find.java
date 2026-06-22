package Recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 5, 7};
        boolean ans = isPresent(arr, 7, 0);
        int ans2 = findIndex(arr, 7, 0);
        int ans3 = findIndexLast(arr, 5, arr.length - 1);
        ArrayList<Integer> ans4 = findAllIndex(arr, 7, 1, new ArrayList<>());
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(findAllIndex2(arr,7,0));
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

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
