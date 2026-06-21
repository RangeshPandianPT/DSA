import java.util.Scanner;

public class GCDofNo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number A: ");
        int a = input.nextInt();
        System.out.print("Enter the number B: ");
        int b = input.nextInt();
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}
