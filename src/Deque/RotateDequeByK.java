package Deque;

import java.util.ArrayDeque;

public class RotateDequeByK {
    static ArrayDeque<Integer> leftRotate(ArrayDeque<Integer> deque, int k){
        for(int i=0; i<k; i++){
            deque.offerLast(deque.removeFirst());
        }
        return deque;
    }

    static ArrayDeque<Integer> rightRotate(ArrayDeque<Integer> deque, int k) {
        for (int i = 0; i < k; i++) {
            deque.offerFirst(deque.removeLast());
        }
        return deque;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int k = 2;

        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);

        System.out.println(leftRotate(deque, k));
        System.out.println(rightRotate(deque, k));
    }
}
