package LinkedList;

public class InsertingLL {

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at Last
    void insertLast(int data){
        if (head == null){
            insert(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at given Index
    void insertIndex(int index,int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (index<0){
            System.out.println("Index out of bounds");
            return;
        }
        for (int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deleting in a LinkedList
    void deleteNode(int data){
        if (head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data!= data){
            temp = temp.next;
        }
        if (temp.next == null){
            System.out.println("Delete failed");
            return;
        }
        temp.next = temp.next.next;
    }

    // Delete with Index
    void deleteIndex (int index){
        Node temp = head;
        if (index<0){
            System.out.println("Index out of bounds");
        }
        for (int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // Searching for the presence
    void search(int data) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at index " + index);
                return;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("Element not found");
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // Main method
    public static void main(String[] args) {

        InsertingLL list = new InsertingLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deleteIndex(2);
        list.search(2);
        System.out.println("Linked List:");
        list.display();
    }
}