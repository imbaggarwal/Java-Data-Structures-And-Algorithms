package Stacks;
import java.util.Arrays;
import java.util.Stack;

// Question: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// Solution:
public class NextGreaterElement {
    static long[] nextLargerElement(long[] arr, int n){
        long[] ans = new long[n];
        Stack<Long> stack = new Stack<>();
        stack.push(arr[n - 1]);
        ans[n - 1] = -1;

        for(int i=n-2; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));
    }
}
