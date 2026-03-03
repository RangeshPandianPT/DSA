/**
 * ============================================
 * DAY 2 - PROBLEM 2: Sum of Array Elements
 * ============================================
 * Difficulty: Easy
 * Topic: Arrays - Basic Traversal & Accumulation
 * 
 * PROBLEM STATEMENT:
 * Given an array of integers, find the sum of all elements.
 * Also calculate the average of all elements.
 * 
 * EXAMPLES:
 * Input:  [1, 2, 3, 4, 5]
 * Sum:    15
 * Average: 3.0
 * 
 * Input:  [10, -5, 20, -10]
 * Sum:    15
 * Average: 3.75
 * 
 * APPROACH:
 * 1. Initialize sum variable to 0
 * 2. Traverse through array, add each element to sum
 * 3. Calculate average = sum / length
 * 
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - constant extra space
 */

public class Problem02_SumOfArray {
    

    public static int findSum(int[] arr) {
      if (arr == null || arr.length == 0) {
        return 0;
}

      int sum = 0;
      for (int num : arr) {  // Enhanced for loop
          sum += num;
      }
     return sum;
  }
  
  public static double findAverage(int[] arr) {
      if (arr == null || arr.length == 0) {
          return 0.0;
      }
      
      // Cast to double to avoid integer division
      return (double) findSum(arr) / arr.length;
  }
    
    // Main method to test your solution
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1: [1, 2, 3, 4, 5]");
        System.out.println("Sum: " + findSum(arr1));     // Expected: 15
        System.out.println("Average: " + findAverage(arr1)); // Expected: 3.0
        
        System.out.println();
        
        // Test Case 2 - With negative numbers
        int[] arr2 = {10, -5, 20, -10};
        System.out.println("Array 2: [10, -5, 20, -10]");
        System.out.println("Sum: " + findSum(arr2));     // Expected: 15
        System.out.println("Average: " + findAverage(arr2)); // Expected: 3.75
        
        System.out.println();
        
        // Test Case 3 - Single element
        int[] arr3 = {42};
        System.out.println("Array 3: [42]");
        System.out.println("Sum: " + findSum(arr3));     // Expected: 42
        System.out.println("Average: " + findAverage(arr3)); // Expected: 42.0
        
        System.out.println();
        
        // Test Case 4 - All zeros
        int[] arr4 = {0, 0, 0, 0};
        System.out.println("Array 4: [0, 0, 0, 0]");
        System.out.println("Sum: " + findSum(arr4));     // Expected: 0
        System.out.println("Average: " + findAverage(arr4)); // Expected: 0.0
        
        System.out.println();
        
        // Test Case 5 - Large numbers
        int[] arr5 = {1000000, 2000000, 3000000};
        System.out.println("Array 5: [1000000, 2000000, 3000000]");
        System.out.println("Sum: " + findSum(arr5));     // Expected: 6000000
        System.out.println("Average: " + findAverage(arr5)); // Expected: 2000000.0
    }
}

/*
 * ============================================
 * SOLUTION (Reveal after attempting):
 * ============================================
 * 
 * public static int findSum(int[] arr) {
 *     if (arr == null || arr.length == 0) {
 *         return 0;
 *     }
 *     
 *     int sum = 0;
 *     for (int num : arr) {  // Enhanced for loop
 *         sum += num;
 *     }
 *     return sum;
 * }
 * 
 * public static double findAverage(int[] arr) {
 *     if (arr == null || arr.length == 0) {
 *         return 0.0;
 *     }
 *     
 *     // Cast to double to avoid integer division
 *     return (double) findSum(arr) / arr.length;
 * }
 * 
 * KEY LEARNINGS:
 * - Enhanced for-loop (for-each) is cleaner for simple traversals
 * - Be careful with integer division when calculating average
 * - Casting to double ensures decimal precision
 * - Reusing methods (findSum in findAverage) promotes DRY principle
 * - Consider overflow for very large sums (use long if needed)
 * 
 * BONUS CHALLENGE:
 * - Modify findSum to use long to handle overflow
 * - What happens if the array has millions of elements?
 */
