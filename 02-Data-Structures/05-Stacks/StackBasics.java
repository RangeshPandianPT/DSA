public class StackBasics {
    public static void main(String[] args) {
        // Basic stack implementation using an array
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is: " + stack.peek());
    }

    static class Stack {
        static final int MAX = 1000;
        int top;
        int a[] = new int[MAX]; // Maximum size of Stack

        boolean isEmpty() {
            return (top < 0);
        }

        Stack(int size) {
            top = -1;
        }

        boolean push(int x) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            } else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }

        int pop() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else {
                int x = a[top--];
                return x;
            }
        }

        int peek() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else {
                int x = a[top];
                return x;
            }
        }
    }
}
