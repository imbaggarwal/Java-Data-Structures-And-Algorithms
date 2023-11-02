package Trees;

//Question: https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1

//Solution:
public class MInMaxInTree {
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

    static int getMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    static int getMin(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(getMin(root.left), getMin(root.right)));
    }

    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(7);
        node.right = new Node(5);
        node.left.right = new Node(6);
        node.right.right = new Node(9);
        node.left.right.left = new Node(1);
        node.left.right.right = new Node(11);
        node.right.right.left = new Node(4);

        System.out.println(getMax(node));
        System.out.println(getMin(node));
    }
}
