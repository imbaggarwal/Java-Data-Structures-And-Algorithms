package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1

// Solution
public class InsertInTheMiddle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node insertInMid(Node head, int data){
        Node newNode = new Node(data);
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
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
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);

        node = insertInMid(node, 3);
        printList(node);
    }
}
