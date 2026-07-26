import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 104 - Maximum Depth of Binary Tree (Easy)
 * Topic: Trees / Depth-First Search & Breadth-First Search
 *
 * Problem: Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Time Complexity: O(n) - We must traverse all n nodes in the tree.
 * Space Complexity: O(h) - Where h is the height of the tree for recursion stack (O(log n) balanced, O(n) worst case).
 */
public class MaxDepthBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Recursive DFS Approach (Bottom-Up)
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    /**
     * Iterative BFS Approach (Level Order Traversal)
     */
    public static int maxDepthBFS(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            depth++; // Increment depth after processing all nodes at the current level
        }

        return depth;
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 104: Maximum Depth of Binary Tree ---");
        // Create tree:
        //    3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        int depthDFS = maxDepth(root);
        int depthBFS = maxDepthBFS(root);

        System.out.println("Max Depth (Recursive DFS): " + depthDFS);
        System.out.println("Max Depth (Iterative BFS): " + depthBFS);
    }
}
