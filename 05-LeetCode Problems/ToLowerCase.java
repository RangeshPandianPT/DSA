package Recursion;

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(toLowerCase(str));
    }
    static String toLowerCase(String str){
        char [] arr = str.toCharArray();
        for (int i =0 ;i<arr.length;i++){
            int ascii = (int) arr[i];
            if (ascii > 64 && ascii < 91){
                arr[i] = (char)(ascii+32);
            }
        }
        return String.valueOf(arr);
    }
}
