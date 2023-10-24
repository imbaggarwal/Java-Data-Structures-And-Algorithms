package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

// Solution:
public class PalindromeOrNot {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow.next);
        Node curr = head;

        while(rev != null){
            if(curr.data != rev.data){
                return false;
            }
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }

    static Node reverse(Node node){
        if(node == null || node.next == null) return node;

        Node before = null;
        Node after = node.next;

        while(node != null){
            after = node.next;
            node.next = before;
            before = node;
            node = after;
        }
        return before;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(0);

        System.out.println(isPalindrome(node));
    }
}
