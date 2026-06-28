package LinkedList;

public class ReverseBetweenLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution class
    static class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {

            if (head == null || left == right) {
                return head;
            }

            ListNode current = head;
            ListNode prev = null;

            // Move current to the left position
            for (int i = 0; current != null && i < left - 1; i++) {
                prev = current;
                current = current.next;
            }

            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;

            // Reverse the sublist
            for (int i = 0; current != null && i < right - left + 1; i++) {
                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {
                    next = next.next;
                }
            }

            // Connect first part
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            // Connect last part
            newEnd.next = current;

            return head;
        }
    }

    // Print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        Solution solution = new Solution();

        // Reverse from position 2 to 4
        head = solution.reverseBetween(head, 2, 4);

        System.out.println("After Reversing Between 2 and 4:");
        printList(head);
    }
}