package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class GetDecimalValue {

    public int getDecimalValue(ListNode head) {
        int total = 0;
        ListNode p = head;

        while (p != null) {
            total = (total * 2) + p.val;
            p = p.next;
        }

        return total;
    }

    public static void main(String[] args) {

        // Binary number: 101
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        GetDecimalValue obj = new GetDecimalValue();

        int result = obj.getDecimalValue(head);

        System.out.println("Decimal Value = " + result);
    }
}