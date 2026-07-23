/**
 * LeetCode 19 - Remove Nth Node From End of List
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * 
 * Time Complexity: O(N) (One pass)
 * Space Complexity: O(1)
 */
public class RemoveNthNode {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Advance first pointer by n + 1 steps
        for (int i = 0; i <= n; i++) {
            if (first == null) return head;
            first = first.next;
        }

        // Move first to end, maintaining distance n between first & second
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove nth node
        second.next = second.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test case: 1 -> 2 -> 3 -> 4 -> 5, n = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List          : ");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.print("After removing 2nd last: ");
        printList(head);
    }
}
