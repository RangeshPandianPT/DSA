import java.util.*;

public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;  
        if (n <= 3) return true;   
        if (n % 2 == 0 || n % 3 == 0) return false; 

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        sc.close();
    }
}
