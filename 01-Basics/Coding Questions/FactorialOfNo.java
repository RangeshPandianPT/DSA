import java.util.Scanner;
public class FactorialOfNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long fact = 1;

        for (int i = 1;i<=n;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
