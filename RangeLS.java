public class RangeLS {
    public static void main(String[] args) {
        int [] arr = {23,5,7,8,10};
        int target = 7;
        int start = 0;
        int end = 1;
        int ans = linerSearch(arr,target,start,end);
        System.out.println(ans);
    }
    static int linerSearch(int[] arr,int target,int start,int end){
        if (arr.length ==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
