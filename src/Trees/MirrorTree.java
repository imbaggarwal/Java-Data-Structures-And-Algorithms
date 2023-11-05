package Trees;

//Question: https://practice.geeksforgeeks.org/problems/mirror-tree/1

//Solution:
public class MirrorTree {
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

    static void mirrorTree(Node node){
        if(node == null){
            return;
        }

        mirrorTree(node.left);
        mirrorTree(node.right);

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    static void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        inOrder(node);
        mirrorTree(node);
        System.out.println();
        inOrder(node);
    }
}
