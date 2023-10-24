package LinkedLists;
import java.util.Scanner;

//Question: https://practice.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1

//Solution
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = prev = null;
    }
}

public class DoublyLLInsertion{
    Node newNode(Node head, int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return head;
        }

        head.next = n;
        n.prev = head;
        head = n;
        return head;
    }

    void printList(Node node){
        Node temp = node;

        while(temp.next != null){
            temp = temp.next;
        }

        while(temp.prev != null){
            temp = temp.prev;
        }

        while(temp != null){
            System.out.print("null<->");
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("<->null");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLLInsertion DLL = new DoublyLLInsertion();

        Node head = null;
        Node root = null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            head = DLL.newNode(head,x);
            if(root == null)    root = head;
        }
        head = root;
        int pos = sc.nextInt();
        int data = sc.nextInt();

        Solution sol = new Solution();
        sol.addNode(head,pos,data);

        DLL.printList(head);
        Node temp;
        while(head.next != null){
            temp = head;
            head = head.next;
        }
    }
}

class Solution{
    void addNode(Node head_ref, int pos, int data){
        Node newNode = new Node(data);
        Node curr = head_ref;

        while(pos-- > 0){
            curr = curr.next;
        }
        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;
    }
}
