package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

// Solution:
public class RotateLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node rotate(Node head, int k){
        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        Node curr = head;
        while(k > 1){
            curr = curr.next;
            k--;
        }

        tail.next = head;
        head = curr.next;
        curr.next = null;

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
        Node node = new Node(2);
        node.next = new Node(4);
        node.next.next = new Node(7);
        node.next.next.next = new Node(8);
        node.next.next.next.next = new Node(9);

        node = rotate(node, 3);
        printList(node);
    }
}
