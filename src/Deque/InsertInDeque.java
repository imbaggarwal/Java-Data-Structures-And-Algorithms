package Deque;

import java.util.ArrayDeque;

public class InsertInDeque {
    static ArrayDeque<Integer> insert(int[] arr, int n){
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            deque.addLast(arr[i]);
        }

        return deque;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println(insert(arr, n));
    }
}
