package LeetCode;

import java.util.Arrays;

public class TotalNumbers {

    public int totalNumbers(int[] digits) {
        int n = digits.length;

        boolean[] seen = new boolean[1000];

        for (int i = 0; i < n; i++) {

            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < n; j++) {

                if (j == i) {
                    continue;
                }

                for (int k = 0; k < n; k++) {

                    if (k == i || k == j) {
                        continue;
                    }

                    int num = (digits[i] * 100)
                            + (digits[j] * 10)
                            + digits[k];

                    if (num % 2 == 0) {
                        seen[num] = true;
                    }
                }
            }
        }

        int count = 0;

        for (boolean exists : seen) {
            if (exists) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        TotalNumbers obj = new TotalNumbers();

        int[] digits1 = {1, 2, 3, 4};

        int result1 = obj.totalNumbers(digits1);

        System.out.println("Input: " + Arrays.toString(digits1));
        System.out.println("Total valid numbers: " + result1);

        int[] digits2 = {0, 2, 4};

        int result2 = obj.totalNumbers(digits2);

        System.out.println("\nInput: " + Arrays.toString(digits2));
        System.out.println("Total valid numbers: " + result2);

        int[] digits3 = {1, 1, 2, 2};

        int result3 = obj.totalNumbers(digits3);

        System.out.println("\nInput: " + Arrays.toString(digits3));
        System.out.println("Total valid numbers: " + result3);
    }
}