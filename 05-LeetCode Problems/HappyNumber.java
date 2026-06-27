package LinkedList;

public class HappyNumber {
    public void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public boolean isHappy (int n) {
        int slow =squaredSum(n);
        int fast =squaredSum(squaredSum(n));

        while (slow != fast){
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        return slow == 1;
    }
    private int squaredSum (int n){
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum = sum + rem*rem;
            n = n/10;
        }
        return sum;
    }
}
