import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {23,5,7,8,10};
        int target = 7;
        int ans = linerSearch(arr,target);
        System.out.println(ans);
    }
    static int linerSearch(int[] arr,int target){
        if (arr.length ==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
