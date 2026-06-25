package CodingQuestions;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the words: ");
        String str  = input.nextLine().toLowerCase();
        int vowles = 0;
        int consonants = 0;

        for (char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                if ("aeiou".indexOf(ch)==-1){
                    vowles++;
                }
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowles);
        System.out.println("Consonants: " + consonants);
    }
}
