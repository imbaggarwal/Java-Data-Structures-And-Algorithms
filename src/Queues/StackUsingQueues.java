package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Question: https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1

//Solution:
public class StackUsingQueues {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int x){
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> queue = q1;
        q1 = q2;
        q2 = queue;
    }

    static int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        int ans = q1.peek();
        q1.remove();
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter 1 to Push");
            System.out.println("Enter 2 to Pop");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter Number to Put In Stack: ");
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
