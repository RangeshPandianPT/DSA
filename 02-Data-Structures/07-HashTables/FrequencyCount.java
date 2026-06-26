import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 1, 2, 5};
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            // If the map contains the key, get its value and add 1, otherwise default to 0 and add 1
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        for (int key : freqMap.keySet()) {
            System.out.println(key + " appears " + freqMap.get(key) + " times.");
        }
    }
}
