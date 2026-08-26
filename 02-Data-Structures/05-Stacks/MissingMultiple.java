package LeetCode;

public class MissingMultiple {
    public int missingMultiple(int[] nums, int k) {
        boolean[]present = new boolean[101];
        for(int i=0;i<nums.length;i++){
            if (nums[i]%k==0){
                present[nums[i]/k]=true;
            }
        }
        for (int i=1;i<=101;i++){
            if (!present[i]){
                return k*i;
            }
        }
        return 101*k;
    }
}

