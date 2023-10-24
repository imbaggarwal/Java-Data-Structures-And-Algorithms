package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1

// Solution
public class DeleteWithoutHeader {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void deleteNode(Node del){
        del.data = del.next.data;
        del.next = del.next.next;
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
        node.next.next = new Node(3);

        deleteNode(node.next);

        printList(node);
    }
}
