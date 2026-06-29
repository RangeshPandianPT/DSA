package CodingQuestions;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        String result = "";
        for (char s : str.toCharArray()){
            if (result.indexOf(s)==-1){
                result += s;
            }
        }
    System.out.println(result);
    }
}