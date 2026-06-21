import java.util.Scanner;
public class LargestofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number A: ");
        int a = input.nextInt();
        System.out.print("Enter a number B: ");
        int b = input.nextInt();
        System.out.print("Enter a number C: ");
        int c = input.nextInt();
        int max = Math.max(Math.max(a,b),c);
        System.out.println("The largest number is" + max);
    }
}
