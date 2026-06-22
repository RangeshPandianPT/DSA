public class SumOfNumber {
    public static void main(String[] args)
     {
        int ans = sum(3231);
        System.out.print(ans);

    }
    static  int sum(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
