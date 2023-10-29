package Trees;

import java.util.ArrayList;

//Question: https://practice.geeksforgeeks.org/problems/inorder-traversal/1

//Solution
public class InOrderTraversal {
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

    static void inOrderFunc(ArrayList<Integer> result, Node root){
        if(root == null){
            return;
        }

        inOrderFunc(result, root.left);
        result.add(root.data);
        inOrderFunc(result, root.right);
    }

    static ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        inOrderFunc(result, root);

        return result;
    }

    public static void main(String[] args) {
        Node newNode = new Node(10);
        newNode.left = new Node(20);
        newNode.right = new Node(30);
        newNode.left.left = new Node(40);
        newNode.left.right = new Node(60);
        newNode.right.left = new Node(50);

        System.out.println(inOrder(newNode));
    }
}
