/**
 * ============================================
 * DAY 2 - PROBLEM 1: Reverse an Array
 * ============================================
 * Difficulty: Easy
 * Topic: Arrays - Two Pointer Technique
 * 
 * PROBLEM STATEMENT:
 * Given an array of integers, reverse the array in-place.
 * 
 * EXAMPLES:
 * Input:  [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 * 
 * Input:  [10, 20]
 * Output: [20, 10]
 * 
 * Input:  [7]
 * Output: [7]
 * 
 * APPROACH:
 * 1. Use two pointers - one at start, one at end
 * 2. Swap elements at both pointers
 * 3. Move pointers towards center
 * 4. Continue until pointers meet/cross
 * 
 * Time Complexity: O(n/2) = O(n) - traverse half the array
 * Space Complexity: O(1) - in-place reversal
 */

public class Problem01_ReverseArray {
    
    // TODO: Implement this method
    public static void reverseArray(int[] arr) {
        if ( arr == null || arr.length <= 1){
            return;
        }
        int left = 0;
        int right = arr.length -1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        
    }
    
    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Main method to test your solution
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.print("Test 1 Before: ");
        printArray(arr1);
        reverseArray(arr1);
        System.out.print("Test 1 After:  ");
        printArray(arr1); // Expected: [5, 4, 3, 2, 1]
        
        System.out.println();
        
        // Test Case 2
        int[] arr2 = {10, 20};
        System.out.print("Test 2 Before: ");
        printArray(arr2);
        reverseArray(arr2);
        System.out.print("Test 2 After:  ");
        printArray(arr2); // Expected: [20, 10]
        
        System.out.println();
        
        // Test Case 3 - Single element
        int[] arr3 = {7};
        System.out.print("Test 3 Before: ");
        printArray(arr3);
        reverseArray(arr3);
        System.out.print("Test 3 After:  ");
        printArray(arr3); // Expected: [7]
        
        System.out.println();
        
        // Test Case 4 - Even length
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        System.out.print("Test 4 Before: ");
        printArray(arr4);
        reverseArray(arr4);
        System.out.print("Test 4 After:  ");
        printArray(arr4); // Expected: [6, 5, 4, 3, 2, 1]
    }
}

/*
 * ============================================
 * SOLUTION (Reveal after attempting):
 * ============================================
 * 
 * public static void reverseArray(int[] arr) {
 *     if (arr == null || arr.length <= 1) {
 *         return; // Nothing to reverse
 *     }
 *     
 *     int left = 0;
 *     int right = arr.length - 1;
 *     
 *     while (left < right) {
 *         // Swap elements
 *         int temp = arr[left];
 *         arr[left] = arr[right];
 *         arr[right] = temp;
 *         
 *         // Move pointers
 *         left++;
 *         right--;
 *     }
 * }
 * 
 * KEY LEARNINGS:
 * - Two-pointer technique is very powerful for array problems
 * - In-place operations save memory (O(1) space)
 * - Swapping requires a temporary variable
 * - Works for both odd and even length arrays
 * - This technique will be used in many future problems!
 */
