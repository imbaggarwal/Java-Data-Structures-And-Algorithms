package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

// Solution:
public class Segregate0s1s2s {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node segregate(Node node){
        Node temp = node;
        int[] arr = new int[3];

        while(temp != null){
            arr[temp.data]++;
            temp = temp.next;
        }

        Node curr = node;
        int i = 0;

        while(curr != null){
            if(arr[i] == 0){
                i++;
            }
            else{
                curr.data = i;
                arr[i]--;
                curr = curr.next;
            }
        }
        return node;
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
        node.next.next.next = new Node(1);
        node.next.next.next.next = new Node(2);
        node.next.next.next.next.next = new Node(0);
        node.next.next.next.next.next.next = new Node(2);
        node.next.next.next.next.next.next.next = new Node(2);

        Node ans = segregate(node);
        printList(ans);
    }
}
