package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/identical-linked-lists/1

// Solution
public class IdenticalLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static boolean isIdentical (Node head1, Node head2){
        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);

        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(3);

        System.out.println(isIdentical(node1, node2));
    }
}
