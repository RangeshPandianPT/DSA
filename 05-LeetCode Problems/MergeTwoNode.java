class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoNode {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode(0); // dummy node
        ListNode tail = head;

        while (list1 != null && list2 != null) {

            ListNode temp;

            if (list1.val < list2.val) {
                temp = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp = new ListNode(list2.val);
                list2 = list2.next;
            }

            tail.next = temp;
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return head.next;
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoNode solver = new MergeTwoNode();

        ListNode merged = solver.mergeTwoLists(list1, list2);

        while (merged != null) {
            System.out.print(merged.val);
            if (merged.next != null) {
                System.out.print(" -> ");
            }
            merged = merged.next;
        }

        System.out.println();
    }
}