package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

// Solution
public class SwapNodesPairwise {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node pairwiseSwap(Node node){
        if(node == null || node.next == null){
            return node;
        }
//        ------------------------------------
        //Method 1: Swapping data
//        ------------------------------------

        // Node curr = node;
        // while(curr != null && curr.next != null){
        //     int temp = curr.data;
        //     curr.data = curr.next.data;
        //     curr.next.data = temp;

        //     curr = curr.next.next;
        // }
        // return node;

//        ------------------------------------
        //Method 2: Swapping nodes
//        ------------------------------------

        Node prev = node;
        Node curr = node.next.next;
        node = node.next;
        node.next = prev;

        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
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
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        node = pairwiseSwap(node);
        printList(node);
    }
}
