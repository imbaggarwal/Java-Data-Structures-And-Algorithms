package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

//Solution:
public class RemoveDuplicatesFromSortedLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void removeDuplicates(Node head){
        Node curr = head;

        while(curr.next != null){
            if(curr.data == curr.next.data){
                Node temp = curr.next.next;
                curr.next = temp;
            }
            else{
                curr = curr.next;
            }
        }
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
        node.next.next = new Node(2);

        removeDuplicates(node);
        printList(node);
    }
}
