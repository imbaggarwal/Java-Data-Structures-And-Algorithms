package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

//Solution:
public class LengthOfLoop {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int countNodesInLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int count = 1;
                slow = slow.next;

                while(slow != fast){
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        Node temp = node.next;
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = temp;

        System.out.println(countNodesInLoop(node));
    }
}
