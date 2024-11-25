
import java.util.*;
public class pgrm6a {
    public static void main(String[] args) {
    
        Stack<Integer> mystack1 = new Stack<Integer>();
        Stack<Double> mystack2 = new Stack<Double>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements into the Integer stack");
        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            mystack1.push(n);
        }

        System.out.println("Enter elements into the Double stack");
        for (int i = 0; i < 5; i++) {
            double m = s.nextDouble();
            mystack2.push(m);
        }

        
        System.out.println("Elements of stack 1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        
        System.out.println("Elements of stack 2:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack2.pop());

        s.close();
    }

    
    public static class Stack<E> {
        E[] stck;
        int top = -1;
        final int size = 10;

        @SuppressWarnings("unchecked")
        public Stack() {
            
            stck = (E[]) new Object[size];
        }

        public void push(E item) {
            if (top == size - 1) {
                System.out.println("Stack is full");
            } else {
                stck[++top] = item;
            }
        }

        public E pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return null; 
            } else {
                return stck[top--]; 
            }
        }
    }
}
