package CodingQuestions;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("At least 2 elements are required.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second Largest Element: " + second);
        }

        input.close();
    }
}