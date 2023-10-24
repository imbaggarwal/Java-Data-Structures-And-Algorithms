package LinkedLists;

// Question: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
// Solution:
public class RemoveLoopInLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(slow == head){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
        }
        else if(slow == fast){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
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
        Node temp = node.next;
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = temp;

        removeLoop(node);
        printList(node);
    }
}
