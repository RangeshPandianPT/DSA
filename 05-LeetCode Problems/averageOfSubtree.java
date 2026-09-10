package LeetCode;

public class averageOfSubtree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        private int result = 0;

        public int averageOfSubtree(TreeNode root) {
            dfs(root);
            return result;
        }

        private long[] dfs(TreeNode node) {
            if (node == null) {
                return new long[]{0, 0};
            }

            long[] left = dfs(node.left);
            long[] right = dfs(node.right);

            long sum = left[0] + right[0] + node.val;
            long count = left[1] + right[1] + 1;

            if (sum / count == node.val) {
                result++;
            }

            return new long[]{sum, count};
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(8);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right.right = new TreeNode(6);

        Solution solution = new Solution();

        int answer = solution.averageOfSubtree(root);

        System.out.println("Answer: " + answer);
    }
}