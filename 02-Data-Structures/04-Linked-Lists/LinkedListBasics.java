class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListBasics {
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        
        System.out.println("Linked List:");
        printList(head);
    }
}
