package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1

// Solution:
public class MergeSort {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = midNode(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);
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
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        Node ans = new Node(-1);
        Node temp = ans;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                temp = head2;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            temp = head1;
            head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = head2;
            head2 = head2.next;
        }
        return ans.next;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(5);
        list1.next.next = new Node(2);
        list1.next.next.next = new Node(4);
        list1.next.next.next.next = new Node(3);

        Node list2 = new Node(6);
        list2.next = new Node(10);
        list2.next.next = new Node(7);
        list2.next.next.next = new Node(9);
        list2.next.next.next.next = new Node(8);

        list1 = mergeSort(list1);
        printList(list1);
    }
}
