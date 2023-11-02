package Trees;

//Question: https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1

//Solution:
public class SizeOfBinaryTree {
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

    static int getSize(Node root){
        if(root == null){
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.left.left = new Node(5);
        node.right.left = new Node(6);

        System.out.println(getSize(node));
    }
}
