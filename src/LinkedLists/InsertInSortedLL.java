package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

// Solution
public class InsertInSortedLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node sortedInsert(Node head1, int key){
        Node newNode = new Node(key);
        if(head1 == null || head1.data > key){
            newNode.next = head1;
            return newNode;
        }

        Node temp = head1;
        while(temp.next != null && temp.next.data < key){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head1;
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
        node.next.next.next = new Node(5);

        node = sortedInsert(node, 6);
        printList(node);
    }
}
