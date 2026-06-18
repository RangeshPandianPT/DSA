public class MaxSubArray {
    public int maxSubArray(int[] nums){
      int curSum = 0;
      int maxSum = Integer.MIN_VALUE;

      for(int i=0;i<nums.length;i++){
        int temp = curSum +nums[i];
        if (temp<nums[i]){
            curSum = nums[i];
        }
        else {
            curSum = temp;
        }
        if (maxSum < curSum){
            maxSum = curSum;
        }

      }
      return maxSum;
    }
    
    public static void main(String[] args) {
        MaxSubArray sol = new MaxSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = sol.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }

}
