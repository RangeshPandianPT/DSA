public class BinaryTreeBasics {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTreeBasics(int key) {
        root = new Node(key);
    }

    BinaryTreeBasics() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTreeBasics tree = new BinaryTreeBasics();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("Binary tree created with root node " + tree.root.key);
    }
}
