package Stacks;
import java.util.Stack;

// Question: https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1

// Solution:
public class MaximumRectangularAreaInHistogram {
    public static long getMaxArea(long[] hist, long n){
        Stack<Long> stack = new Stack<>();
        long res = 0;
        long val = 0;
        long curr = 0;
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && hist[(int)(long)(stack.peek())] >= hist[i]){
                val = stack.pop();
                curr = hist[(int)val] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                res = Math.max(res, curr);
            }
            stack.push((long)i);
        }
        while(!stack.isEmpty()){
            val = stack.pop();
            curr = hist[(int)val] * (stack.isEmpty() ? n : n - stack.peek() - 1);
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        long[] arr = {6,2,5,4,5,1,6};
        System.out.println(getMaxArea(arr, arr.length));
    }
}
