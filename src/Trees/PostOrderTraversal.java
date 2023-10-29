package Trees;

import java.util.ArrayList;

//Question: https://practice.geeksforgeeks.org/problems/postorder-traversal/1

//Solution
public class PostOrderTraversal {
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

    static void postOrderFunc(ArrayList<Integer> result, Node root){
        if(root == null){
            return;
        }

        postOrderFunc(result, root.left);
        postOrderFunc(result, root.right);
        result.add(root.data);
    }

    static ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        postOrderFunc(result, root);

        return result;
    }

    public static void main(String[] args) {
        Node newNode = new Node(19);
        newNode.left = new Node(10);
        newNode.right = new Node(8);
        newNode.left.left = new Node(11);
        newNode.left.right = new Node(13);

        System.out.println(postOrder(newNode));
    }
}
