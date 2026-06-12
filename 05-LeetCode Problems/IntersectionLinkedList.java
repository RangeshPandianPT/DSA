public class IntersectionLinkedList {
    public ListNode getIntersectionNode (ListNode headA , ListNode headB){
        ListNode t1 = headA;
        ListNode t2 = headB;

        while (t1 != t2){
            t1 = (t1 == null) ? headB : t1.next;
            t2 = (t2 == null) ? headA : t2.next;
        }
        return t1;
    }
    public static void main (String[]args){
        // Create intersecting nodes
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;

        IntersectionLinkedList solver = new IntersectionLinkedList();
        ListNode intersection = solver.getIntersectionNode(headA, headB);
        
        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
    }
        
}
