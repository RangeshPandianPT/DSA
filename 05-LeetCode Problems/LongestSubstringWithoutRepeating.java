import java.util.HashMap;

/**
 * LeetCode 3 - Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Time Complexity: O(N) Sliding Window with HashMap
 * Space Complexity: O(min(N, M)) where M is size of charset
 */
public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                // Move left pointer past previous instance of currentChar
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        System.out.println("Input: \"" + test1 + "\" -> Longest Substring Length: " + lengthOfLongestSubstring(test1)); // Expected 3
        System.out.println("Input: \"" + test2 + "\" -> Longest Substring Length: " + lengthOfLongestSubstring(test2)); // Expected 1
        System.out.println("Input: \"" + test3 + "\" -> Longest Substring Length: " + lengthOfLongestSubstring(test3)); // Expected 3
    }
}
