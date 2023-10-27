package Deque;

import java.util.ArrayDeque;
import java.util.ArrayList;

//Question: https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

//Solution:
public class MaximumOfSubArrays {
    static ArrayList<Integer> maxOfSubArrays(int[] arr, int n, int k){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<k; i++){
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for(int i=k; i<n; i++){
            ans.add(arr[deque.getFirst()]);

            while(!deque.isEmpty() && deque.peek() <= i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }

            deque.addLast(i);
        }

        ans.add(arr[deque.getFirst()]);

        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int n = arr.length;
        int k = 3;
        System.out.println(maxOfSubArrays(arr, n, k));
    }
}
