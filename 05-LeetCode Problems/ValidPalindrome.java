/**
 * LeetCode 125 - Valid Palindrome (Easy)
 * Topic: Two Pointers, Strings
 *
 * Problem: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 125: Valid Palindrome ---");
        
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + isPalindrome(s1)); // Expected: true
        
        String s2 = "race a car";
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: " + isPalindrome(s2)); // Expected: false
        
        String s3 = " ";
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: " + isPalindrome(s3)); // Expected: true
    }
}
