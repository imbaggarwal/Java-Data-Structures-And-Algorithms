package Stacks;

import java.util.Stack;

public class RemoveMiddleOfStack {
    static void deleteMid(Stack<Integer> stack, int size){
        stack.remove((size + 1) / 2 - 1);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int size = 5;

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        deleteMid(stack, size);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
