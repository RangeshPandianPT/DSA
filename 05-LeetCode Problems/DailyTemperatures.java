import java.util.Arrays;
import java.util.Stack;

/**
 * LeetCode 739 - Daily Temperatures
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait after the i-th day to get a warmer temperature.
 * 
 * Time Complexity: O(N) using Monotonic Decreasing Stack
 * Space Complexity: O(N)
 */
public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);

        System.out.println("Input Temperatures : " + Arrays.toString(temperatures));
        System.out.println("Days to Wait       : " + Arrays.toString(result));
    }
}
