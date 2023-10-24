package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

// Solution
public class DetectLoopInLL {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        Node temp = node.next;
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = temp;

        System.out.println(detectLoop(node));



    }
}
