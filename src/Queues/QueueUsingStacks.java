package Queues;

import java.util.Scanner;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/queue-using-stack/1

//Solution:
public class QueueUsingStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    static int pop(){
        if(s1.isEmpty()){
            return -1;
        }

        return s1.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter 1 to Enqueue");
            System.out.println("Enter 2 to Dequeue");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter Number to Enqueue: ");
                int num = sc.nextInt();
                System.out.println();
                push(num);
            } else if (option == 2) {
                System.out.println("Popped: " + pop());
            } else {
                System.out.println("Invalid Option");
            }
        }while(true);
    }
}
