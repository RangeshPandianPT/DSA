import java.util.Scanner;

class Solution {

    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }

        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}

public class ReverseInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.reverse(num);

        System.out.println("Reversed integer: " + result);

        sc.close();
    }
}