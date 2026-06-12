 class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }
  
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LinkedListCycle sol = new LinkedListCycle();
        boolean result = sol.hasCycle(head);
        System.out.println("Cycle present: " + result);
    }
    
}
