package LinkedLists;

// Ques: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

// Solution
public class IntersectionPointInYShapedLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int intersectPoint(Node head1, Node head2){
        int list1 = 0;
        int list2 = 0;

        Node curr = head1;
        while(curr != null){
            list1++;
            curr = curr.next;
        }

        curr = head2;
        while(curr != null){
            list2++;
            curr = curr.next;
        }

        int diff = Math.abs(list1 - list2);
        Node temp1 = list1 > list2 ? head1 : head2;

        while(diff > 0 && temp1.next != null){
            temp1 = temp1.next;
            diff--;
        }

        Node temp2 = list1 > list2 ? head2 : head1;

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        Node node3 = new Node(8);

        node1.next = new Node(1);
        node1.next.next = node3;

        node2.next = new Node(6);
        node2.next.next = new Node(1);
        node2.next.next.next = node3;

        node3.next = new Node(4);
        node3.next.next = new Node(5);

        System.out.println(intersectPoint(node1, node2));
    }
}
