public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current != head);
            System.out.println("(head)");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.display();
    }
}
