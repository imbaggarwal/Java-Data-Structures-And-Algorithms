package Trees;

//Question: https://practice.geeksforgeeks.org/problems/binary-tree-to-cdll/1

//Solution:
public class BinaryTreeToCircularDoublyLinkedList {
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

    static Node head = null;
    static Node prev = null;

    static Node treeToCDLL(Node root){
        if(root == null){
            return null;
        }

        treeToCDLL(root.left);

        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }

        prev = root;
        treeToCDLL(root.right);

        if(prev.right == null){
            head.left = prev;
            prev.right = head;
        }

        return head;
    }

    static void printCDLL(Node head){
        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.right;
        }while(temp != head);
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(60);

        Node head = treeToCDLL(node);
        printCDLL(head);
    }
}
