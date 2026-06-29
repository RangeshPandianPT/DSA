package CodingQuestions;

public class NumOfStrings {
    public static void main(String[] args) {
    String [] arr = {"a","abc","bc","d"};
    String str = "abc";
    int ans = numOfStrings(arr,str);
    System.out.println(ans);
    }
    public static int numOfStrings(String[] arr , String str) {
        int count = 0;

        for ( String s : arr){
            if (str.contains(s)){
                count++;
            }
        }
        return count;
    }
}
