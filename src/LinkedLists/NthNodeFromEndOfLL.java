package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

// Solution:
public class NthNodeFromEndOfLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int getNode(Node node, int n){
        Node temp1 = node;
        Node temp2 = node;

        while(temp2.next != null){
            if(n-- > 1){
                temp2 = temp2.next;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return n > 1 ? -1 : temp1.data;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = new Node(8);
        node.next.next.next.next.next.next.next.next = new Node(9);

        System.out.println(getNode(node, 2));
    }
}
