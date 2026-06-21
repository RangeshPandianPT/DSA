import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        while (n!=0){
            int digit = n%10;
            sum += digit * digit * digit;
            n/=10;
        }
        System.out.println(temp==n?"Armstrong Number":"Not Armstrong Number");
    }
}
