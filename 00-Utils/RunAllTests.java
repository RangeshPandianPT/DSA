import java.util.Arrays;

/**
 * Master verification test suite that executes unit tests across core algorithms,
 * LeetCode solutions, and utility modules using the TestRunner framework.
 */
public class RunAllTests {

    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println(" 🌟 EXECUTION MASTER TEST SUITE FOR DSA PROJECT 🌟");
        System.out.println("=======================================================");

        // Test 1: Two Pointers
        TestRunner.startSuite("Two Pointers Algorithmic Patterns");
        TestRunner.assertArrayEquals("Two Sum Sorted [2,7,11,15] target 9", 
                new int[]{1, 2}, 
                TwoPointersBasics.twoSumSorted(new int[]{2, 7, 11, 15}, 9));
        TestRunner.assertTrue("Palindrome Check 'A man, a plan, a canal: Panama'", 
                TwoPointersBasics.isPalindrome("A man, a plan, a canal: Panama"));
        TestRunner.assertFalse("Palindrome Check 'race a car'", 
                TwoPointersBasics.isPalindrome("race a car"));
        TestRunner.endSuite();

        // Test 2: Sliding Window
        TestRunner.startSuite("Sliding Window Algorithmic Patterns");
        TestRunner.assertEquals("Max Sum Subarray Size 3", 
                9, 
                SlidingWindowBasics.maxSumSubarrayOfSizeK(new int[]{2, 1, 5, 1, 3, 2}, 3));
        TestRunner.assertEquals("Min Subarray Len with Sum >= 7", 
                2, 
                SlidingWindowBasics.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        TestRunner.endSuite();

        // Test 3: Trees & Graphs (Week 3 Additions)
        TestRunner.startSuite("Week 3 Core Solutions (Trees & Graphs)");
        
        // Tree Depth
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree.TreeNode(3,
                new MaxDepthBinaryTree.TreeNode(9),
                new MaxDepthBinaryTree.TreeNode(20, new MaxDepthBinaryTree.TreeNode(15), new MaxDepthBinaryTree.TreeNode(7)));
        TestRunner.assertEquals("Max Depth of Binary Tree (DFS)", 3, MaxDepthBinaryTree.maxDepth(root));
        TestRunner.assertEquals("Max Depth of Binary Tree (BFS)", 3, MaxDepthBinaryTree.maxDepthBFS(root));

        // Number of Islands
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        TestRunner.assertEquals("Number of Islands (Grid 1)", 1, NumberOfIslands.numIslands(grid1));
        TestRunner.endSuite();

        // Test 4: Dynamic Programming
        TestRunner.startSuite("Dynamic Programming Solutions");
        TestRunner.assertEquals("Climbing Stairs (n = 2)", 2, ClimbingStairs.climbStairs(2));
        TestRunner.assertEquals("Climbing Stairs (n = 3)", 3, ClimbingStairs.climbStairs(3));
        TestRunner.assertEquals("Climbing Stairs (n = 5)", 8, ClimbingStairs.climbStairs(5));
        TestRunner.endSuite();

        System.out.println("🎉 MASTER TEST SUITE FINISHED SUCCESSFUL EXECUTION! 🎉");
    }
}
