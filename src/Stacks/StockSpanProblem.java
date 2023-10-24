package Stacks;

// Ques: https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

import java.util.Arrays;
import java.util.Stack;

// Solution
public class StockSpanProblem {
    public static int[] calculateSpan(int[] price, int n){
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        arr[0] = 1;

        for(int i=1; i<n; i++){
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){
                stack.pop();
            }
            arr[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        System.out.println(Arrays.toString(calculateSpan(price, n)));
    }
}
