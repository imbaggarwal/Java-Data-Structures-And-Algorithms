package LinkedLists;
import java.util.Scanner;

// Ques: https://practice.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1

// Solution
public class MergeSortOnDoublyLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node sortDoubly(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = midNode(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sortDoubly(left);
        right = sortDoubly(right);
        Node ans = merge(left, right);

        return ans;
    }

    static Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node head1, Node head2){
        Node dummy = new Node(0);
        Node curr = dummy;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                curr.next = head1;
                head1.prev = curr;
                head1 = head1.next;
            }
            else{
                curr.next = head2;
                head2.prev = curr;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if(head1 != null){
            curr.next = head1;
            head1.prev = curr;
        }
        if(head2 != null){
            curr.next = head2;
            head2.prev = curr;
        }
        dummy.next.prev = null;
        return dummy.next;
    }

    static void printList(Node node){
        Node temp = node;
        while(node != null){
            System.out.print(node.data + " ");
            temp = node;
            node = node.next;
        }
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        Node temp = head;

        for (int i = 1;i < n;i++){
            int a = sc.nextInt();
            Node n1 = new Node(a);
            n1.prev = temp;
            temp.next = n1;
            temp = n1;
        }

        head = sortDoubly(head);
        printList(head);
    }
}
