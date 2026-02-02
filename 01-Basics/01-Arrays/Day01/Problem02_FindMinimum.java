/**
 * ============================================
 * DAY 1 - PROBLEM 2: Find Minimum Element
 * ============================================
 * Difficulty: Easy
 * Topic: Arrays - Basic Traversal
 * 
 * PROBLEM STATEMENT:
 * Given an array of integers, find the minimum element.
 * 
 * EXAMPLES:
 * Input:  [3, 7, 2, 9, 1, 5]
 * Output: 1
 * 
 * Input:  [-5, -2, -8, -1]
 * Output: -8
 * 
 * APPROACH:
 * 1. Initialize min with first element
 * 2. Traverse array, update min if current < min
 * 3. Return min
 * 
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - only using one variable
 */

public class Problem02_FindMinimum {
    
    // Solution Method
    public static int findMinimum(int[] arr) {
        // TODO: Implement your solution here
        // Hint: Similar to finding max, but use < instead of >
        
        return 0; // Replace with your answer
    }
    
    // Bonus Challenge: Find both min and max in single pass!
    public static int[] findMinMax(int[] arr) {
        // TODO: Return array of [min, max]
        // Can you do it with fewer comparisons?
        
        return new int[]{0, 0}; // Replace with your answer
    }
    
    // Main method to test your solution
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {3, 7, 2, 9, 1, 5};
        System.out.println("Test 1: " + findMinimum(arr1)); // Expected: 1
        
        // Test Case 2
        int[] arr2 = {-5, -2, -8, -1};
        System.out.println("Test 2: " + findMinimum(arr2)); // Expected: -8
        
        // Test Case 3
        int[] arr3 = {42};
        System.out.println("Test 3: " + findMinimum(arr3)); // Expected: 42
        
        // Bonus Test
        int[] arr4 = {5, 3, 8, 1, 9, 2};
        int[] result = findMinMax(arr4);
        System.out.println("Bonus: Min=" + result[0] + ", Max=" + result[1]); 
        // Expected: Min=1, Max=9
    }
}

/*
 * ============================================
 * SOLUTION (Reveal after attempting):
 * ============================================
 * 
 * public static int findMinimum(int[] arr) {
 *     if (arr == null || arr.length == 0) {
 *         throw new IllegalArgumentException("Array is empty");
 *     }
 *     
 *     int min = arr[0];
 *     for (int i = 1; i < arr.length; i++) {
 *         if (arr[i] < min) {
 *             min = arr[i];
 *         }
 *     }
 *     return min;
 * }
 * 
 * // Bonus Solution - Find Min and Max together
 * public static int[] findMinMax(int[] arr) {
 *     int min = arr[0], max = arr[0];
 *     for (int i = 1; i < arr.length; i++) {
 *         if (arr[i] < min) min = arr[i];
 *         if (arr[i] > max) max = arr[i];
 *     }
 *     return new int[]{min, max};
 * }
 * 
 * KEY LEARNINGS:
 * - Combining min/max in one pass is more efficient
 * - Pattern recognition: many problems use this traversal pattern
 */
