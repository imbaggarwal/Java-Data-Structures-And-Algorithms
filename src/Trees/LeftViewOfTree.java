package Trees;

import java.util.ArrayList;

public class LeftViewOfTree {
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
    static int maxLevel = 0;

    static void leftView(Node root, ArrayList<Integer> list, int level){
        if(root == null){
            return;
        }

        if(maxLevel < level){
            list.add(root.data);
            maxLevel = level;
        }

        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1);
    }

    static ArrayList<Integer> printResult(Node root){
        ArrayList<Integer> list = new ArrayList<>();

        leftView(root, list, 1);
        return list;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left.right = new Node(8);

        System.out.println(printResult(node));
    }
}
