package LeetCode;

public class IsSameTree {

    // Define TreeNode structure
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to check if two trees are same
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        IsSameTree obj = new IsSameTree();

        // Tree 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        // Tree 2
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);

        boolean result = obj.isSameTree(t1, t2);
        System.out.println("Are trees same? " + result);
    }
}