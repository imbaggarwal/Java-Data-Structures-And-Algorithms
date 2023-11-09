package Trees;

//Question: https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1

//Solution:
public class BinaryTreeToDoublyLinkedList {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Node prev = null;

    static Node BTToDLL(Node node){
        if(node == null){
            return null;
        }

        Node head = BTToDLL(node.left);

        if(prev == null){
            head = node;
        }
        else{
            node.left = prev;
            prev.right = node;
        }
        prev = node;

        BTToDLL(node.right);

        return head;
    }

    static void printDLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(12);
        node.right = new Node(15);
        node.left.left = new Node(25);
        node.left.right = new Node(30);
        node.right.left = new Node(36);

        Node ans = BTToDLL(node);
        printDLL(ans);
    }
}
