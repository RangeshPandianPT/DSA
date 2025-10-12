import java.util.*;

public class Solution {
    private Stack<Character> stack;
    private Queue<Character> queue;

    public Solution() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter() {
        return stack.pop();
    }

    char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        Solution p = new Solution();

        for (char c : input.toCharArray()) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is " 
                + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }
}
