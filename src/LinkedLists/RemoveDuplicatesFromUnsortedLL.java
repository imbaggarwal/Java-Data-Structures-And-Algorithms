package LinkedLists;
import java.util.HashSet;

// Question: https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

// Solution:
public class RemoveDuplicatesFromUnsortedLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node removeDuplicates(Node head){
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        set.add(curr.data);

        while(curr.next != null){
            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
                set.add(curr.data);
            }
        }
        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(1);
        node.next.next.next = new Node(2);

        node = removeDuplicates(node);
        printList(node);
    }
}
