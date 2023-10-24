package LinkedLists;

//Question: https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

//Solution:
public class CountNodesInLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int getCount(Node head){
        int count = 0;

        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        System.out.println(getCount(node));
    }
}
