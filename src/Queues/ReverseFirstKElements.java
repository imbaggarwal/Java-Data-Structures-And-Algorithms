package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

//Solution:
public class ReverseFirstKElements {
    static Queue<Integer> reverseK(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++){
            stack.push(queue.peek());
            queue.remove();
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for(int i=0; i<queue.size()-k; i++){
            queue.add(queue.peek());
            queue.remove();
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int k = 5;

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(reverseK(queue, k));
    }
}
