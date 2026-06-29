package CodingQuestions;

import java.util.HashMap;

public class HashMapAverage {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 2);
        map.put("C", 4);
        map.put("D", 5);

        int sum = 0;
        double avg = 0;
        for (Integer i : map.values()) {
            sum+=i;
        }
        avg = sum/map.size();
        System.out.println("Average is "+avg);
    }
}
