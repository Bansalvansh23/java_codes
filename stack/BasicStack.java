package stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // to add element in the stack
        stack.push(10);
        stack.push(20);
        System.out.println(stack);

        // to check the topmost element of the stack
        System.out.println(stack.peek());

        // to remove the topmost element from the stack
        stack.pop();
        System.out.println(stack);

        // to check whether the stack is empty or not
        System.out.println(stack.isEmpty());

    }
}
