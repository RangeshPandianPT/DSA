import java.util.*;
import java.io.*;


class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Calculator myCalculator = new Calculator();
        while (t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
