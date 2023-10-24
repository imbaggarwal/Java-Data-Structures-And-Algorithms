package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

// Solution
public class AddLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node addTwoLists(Node first, Node second){
        Node newNode = new Node(-1);
        Node temp = newNode;

        Node head1 = reverse(first);
        Node head2 = reverse(second);

        int carry = 0;

        while(head1 != null || head2 != null || carry == 1){
            int sum = 0;
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }
        return reverse(newNode.next);
    }

    static Node reverse(Node head){
        Node before = null;
        Node after = head.next;

        while(head != null){
            after = head.next;
            head.next = before;
            before = head;
            head = after;
        }
        return before;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(
                3);

        Node second = new Node(5);
        second.next = new Node(6);
        second.next.next = new Node(4);

        Node result = addTwoLists(first, second);
        printList(result);
    }
}
