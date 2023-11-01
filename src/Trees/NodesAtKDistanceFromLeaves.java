package Trees;

import java.util.ArrayList;
import java.util.HashSet;

public class NodesAtKDistanceFromLeaves {
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

    static HashSet<Node> set = new HashSet<>();

    static void preOrder(Node root, ArrayList<Node> list, int k){
        if(root == null){
            return;
        }
        list.add(root);

        if(root.left == null && root.right == null){
            if(list.size() - 1 >= k){
                set.add(list.get(list.size() - 1 - k));
            }
        }

        preOrder(root.left, list, k);
        preOrder(root.right, list, k);
        list.remove(list.size() - 1);
    }
    static int countNodes(Node root, int k){
        ArrayList<Node> list = new ArrayList<>();

        preOrder(root, list, k);
        return set.size();
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.right.left.right = new Node(8);

        int k = 2;

        System.out.println(countNodes(node, k));
    }
}
