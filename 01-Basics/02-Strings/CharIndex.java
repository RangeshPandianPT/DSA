package Strings;
import java.util.*;

public class CharIndex {
    static void main(String[] args) {
        String str = "Rangesh is a boy";
        str = str.replace(" ","");
        System.out.println(str);
        char ch = str.toCharArray()[0];
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character: " + str.charAt(i) + " Index: " +i);
        }
    }
}
