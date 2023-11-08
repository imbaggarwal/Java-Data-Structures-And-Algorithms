package Trees;

import java.util.HashSet;

//Question: https://practice.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1

//Solution:
public class VerticalWidthOfTree {
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

    private static void traverse(Node node, int distance, HashSet<Integer> set){
        if(node == null){
            return;
        }

        traverse(node.left, distance - 1, set);
        set.add(node.data);
        traverse(node.right, distance + 1, set);
    }

    static int verticalWidth(Node root){
        HashSet<Integer> set = new HashSet<>();

        traverse(root, 0, set);

        return set.size();
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.right.right = new Node(5);

        System.out.println(verticalWidth(node));
    }
}
