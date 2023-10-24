package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/queue-reversal/1

//Solution:
public class QueueReversal {
    static Queue<Integer> reversal(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.peek());
            queue.remove();
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            queue.add(num);
        }

        System.out.println("Before Reversal: " + queue);
        System.out.println("After Reversal: " + reversal(queue));
    }
}
