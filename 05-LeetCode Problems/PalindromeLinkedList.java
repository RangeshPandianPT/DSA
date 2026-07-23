/**
 * LeetCode 234 - Palindrome Linked List
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class PalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1. Find middle of linked list using fast/slow pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half of linked list
        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfHead = head;
        ListNode p2 = secondHalfHead;

        // 3. Compare first half and reversed second half
        boolean result = true;
        while (p2 != null) {
            if (firstHalfHead.val != p2.val) {
                result = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            p2 = p2.next;
        }

        // Restore list (optional good practice)
        reverseList(secondHalfHead);

        return result;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Test case: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Is 1->2->2->1 a palindrome? " + isPalindrome(head));

        // Test case: 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Is 1->2 a palindrome? " + isPalindrome(head2));
    }
}
