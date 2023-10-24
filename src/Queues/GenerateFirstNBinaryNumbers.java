package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Question: https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1

//Solution:
public class GenerateFirstNBinaryNumbers {
    static ArrayList<String> generateBinary(int n){
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> result = new ArrayList<>();

        queue.add("1");

        for(int i=0; i<n; i++){
            String ans = queue.peek();
            result.add(ans);
            queue.remove();

            queue.add(ans + "0");
            queue.add(ans +"1");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(generateBinary(n));
    }
}
