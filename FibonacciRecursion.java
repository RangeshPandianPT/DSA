public class FibonacciRecursion  {

    // Recursive method to calculate the nth Fibonacci number
    public static int getFibonacci(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}

