package LeetCode;

public class JudgeCircle  {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            if (moves.charAt(i) =='U'){
                y++;
            }
            else if (moves.charAt(i)=='D'){
                y--;
            }
            else if (moves.charAt(i)=='L'){
                x--;
            }
            else {
                x++;
            }
        }
        if (x==0 && y==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        JudgeCircle judgeCircle = new JudgeCircle();
        System.out.println(judgeCircle.judgeCircle("UD"));
        System.out.println(judgeCircle.judgeCircle("LL"));
    }
}
