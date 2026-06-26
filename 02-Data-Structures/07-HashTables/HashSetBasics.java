import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // Duplicate, will not be added

        System.out.println("Set size: " + set.size()); // 3
        System.out.println("Set elements: " + set);

        // Check if an element exists
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }

        // Remove an element
        set.remove(2);
        System.out.println("After removing 2: " + set);

        // Iterate over elements
        System.out.println("Iterating:");
        for (int num : set) {
            System.out.println(num);
        }
    }
}
