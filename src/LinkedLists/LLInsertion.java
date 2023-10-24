package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0

//Solution:
public class LLInsertion {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtBeginning(Node head, int x){
        Node newNode = new Node(x);

        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x){
        Node newNode = new Node(x);

        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

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
        node.next.next = new Node(3);

        node = insertAtBeginning(node, 0);
        node = insertAtEnd(node, 4);

        printList(node);
    }
}
