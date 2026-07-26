import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 226 - Invert Binary Tree (Easy)
 * Topic: Trees / Breadth-First & Depth-First Search
 *
 * Problem: Given the root of a binary tree, invert the tree (mirror it around its center), and return its root.
 *
 * Time Complexity: O(n) - where n is the number of nodes in the tree since we visit each node once.
 * Space Complexity: O(h) - where h is the height of the tree due to the recursion stack (O(n) worst case for skewed tree).
 */
public class InvertBinaryTree {

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
     * Recursive DFS Solution
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    /**
     * Iterative BFS Solution using Queue
     */
    public static TreeNode invertTreeBFS(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Swap left and right children
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return root;
    }

    // Helper to print tree in level order (BFS) for verification
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 226: Invert Binary Tree ---");
        // Create tree:
        //      4
        //    /   \
        //   2     7
        //  / \   / \
        // 1   3 6   9
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        System.out.print("Original Tree (Level Order): ");
        printLevelOrder(root);

        invertTree(root);

        System.out.print("Inverted Tree (Level Order): ");
        printLevelOrder(root);
    }
}
