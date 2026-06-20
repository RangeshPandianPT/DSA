/* public class OddorEven {
    public static void main(String[] args) {
        int n=49;
        System.out.println((isOdd(n)));
    }
    public static boolean isOdd(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}
*/
//One more way to find this

public class OddorEven {
    public static void main(String[] args) {
        int n=59;
        System.out.println((isOdd(n)));
    }
    static boolean isOdd(int n ){
        return (n&1)==1;
    }
}