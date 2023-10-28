package Deque;

import java.util.ArrayDeque;
import java.util.Objects;

public class DeletionInDeque{
    static void eraseAt(ArrayDeque<Integer> deq , int x){
        int n = deq.size();

        for(int i=0; i<n; i++){
            if(i == x){
                deq.pollFirst();
            }
            else{
                deq.offerLast(Objects.requireNonNull(deq.pollFirst()));
            }
        }
    }

    static void eraseInRange(ArrayDeque<Integer> deq , int start, int end){
        int n = deq.size();

        for(int i=0; i<n; i++){
            if(i >= start && i <end){
                deq.pollFirst();
            }
            else{
                deq.offerLast(Objects.requireNonNull(deq.pollFirst()));
            }
        }
    }

    static void eraseAll(ArrayDeque<Integer> deq){
        deq.clear();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        int start = 0;
        int end = 1;
        int x = 1;

        eraseAt(deque, x);
        eraseInRange(deque, start, end);
        eraseAll(deque);

        System.out.println(deque);
    }
}
