/**
 * LeetCode 11 - Container With Most Water
 * Given n non-negative integers height where each represents a point at coordinate (i, height[i]),
 * find two lines that together with the x-axis form a container, such that the container contains the most water.
 * 
 * Time Complexity: O(N) Two Pointers
 * Space Complexity: O(1)
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;

            maxWater = Math.max(maxWater, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);

        System.out.println("Heights Array   : [1, 8, 6, 2, 5, 4, 8, 3, 7]");
        System.out.println("Maximum Water Area: " + result); // Expected output: 49
    }
}
