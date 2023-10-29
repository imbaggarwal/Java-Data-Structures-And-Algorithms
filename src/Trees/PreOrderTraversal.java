package Trees;

import java.util.ArrayList;

//Question: https://practice.geeksforgeeks.org/problems/preorder-traversal/1

//Solution
public class PreOrderTraversal {
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

    static void preOrderFunc(ArrayList<Integer> result, Node root){
        if(root == null){
            return;
        }
        result.add(root.data);

        preOrderFunc(result, root.left);
        preOrderFunc(result, root.right);
    }

    static ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        preOrderFunc(result, root);

        return result;
    }

    public static void main(String[] args) {
        Node newNode = new Node(6);
        newNode.left = new Node(3);
        newNode.right = new Node(2);
        newNode.left.right = new Node(1);
        newNode.right.left = new Node(2);

        System.out.println(preOrder(newNode));
    }
}
