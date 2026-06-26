import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        // By default, PriorityQueue in Java is a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);

        System.out.println("Min-Heap Peek: " + minHeap.peek()); // 5
        System.out.println("Min-Heap Polled: " + minHeap.poll()); // 5
        System.out.println("New Min-Heap Peek: " + minHeap.peek()); // 10

        // Creating a Max-Heap using Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);

        System.out.println("\nMax-Heap Peek: " + maxHeap.peek()); // 20
        System.out.println("Max-Heap Polled: " + maxHeap.poll()); // 20
    }
}
