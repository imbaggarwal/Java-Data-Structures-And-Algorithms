package LinkedLists;
import java.util.Scanner;

// Question: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

// Solution:
public class ReverseLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseList(Node head){
        if(head == null || head.next == null) return head;

        Node before = null;
        Node after = head.next;

        while(head != null){
            after = head.next;
            head.next = before;
            before = head;
            head = after;
        }
        return before;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node node = new Node(sc.nextInt());
        Node tail = node;

        for(int i=0; i<n-1; i++){
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }
        node = reverseList(node);
        printList(node);
    }
}
