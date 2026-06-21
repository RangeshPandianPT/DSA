import java.util.Scanner;
public class PalindromeCheckNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int rev = 0;
        while (n!=0){
            rev = rev*10 +n%10;
            n/=10;
        }
        System.out.println(temp==rev? "It is a Palindrome number":"It is not a Palindrome number" );
    }
}
