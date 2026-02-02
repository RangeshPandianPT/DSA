/**
 * ============================================
 * DAY 1 - PROBLEM 1: Find Maximum Element
 * ============================================
 * Difficulty: Easy
 * Topic: Arrays - Basic Traversal
 * 
 * PROBLEM STATEMENT:
 * Given an array of integers, find the maximum element.
 * 
 * EXAMPLES:
 * Input:  [3, 7, 2, 9, 1, 5]
 * Output: 9
 * 
 * Input:  [-5, -2, -8, -1]
 * Output: -1
 * 
 * APPROACH:
 * 1. Initialize max with first element
 * 2. Traverse array, update max if current > max
 * 3. Return max
 * 
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - only using one variable
 */

public class Problem01_FindMaximum {
    
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (arr[i] > max) {
            max = arr[i];
            }
        }
    return max;
    }

    
    
    // Main method to test your solution
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {3, 7, 2, 9, 1, 5};
        System.out.println("Test 1: " + findMaximum(arr1)); // Expected: 9
        
        // Test Case 2
        int[] arr2 = {-5, -2, -8, -1};
        System.out.println("Test 2: " + findMaximum(arr2)); // Expected: -1
        
        // Test Case 3
        int[] arr3 = {42};
        System.out.println("Test 3: " + findMaximum(arr3)); // Expected: 42
        
        // Test Case 4
        int[] arr4 = {1, 1, 1, 1};
        System.out.println("Test 4: " + findMaximum(arr4)); // Expected: 1
    }
}

/*
 * ============================================
 * SOLUTION (Reveal after attempting):
 * ============================================
 * 
 * public static int findMaximum(int[] arr) {
 *     if (arr == null || arr.length == 0) {
 *         throw new IllegalArgumentException("Array is empty");
 *     }
 *     
 *     int max = arr[0];
 *     for (int i = 1; i < arr.length; i++) {
 *         if (arr[i] > max) {
 *             max = arr[i];
 *         }
 *     }
 *     return max;
 * }
 * 
 * KEY LEARNINGS:
 * - Always handle edge cases (empty array)
 * - Start loop from index 1 since max is initialized to arr[0]
 * - Works for negative numbers too!
 */
