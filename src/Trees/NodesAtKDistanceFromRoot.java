package Trees;

import java.util.ArrayList;

//Question: https://practice.geeksforgeeks.org/problems/k-distance-from-root/1

//Solution:
public class NodesAtKDistanceFromRoot {
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

    static void KDistanceNodes(Node root, ArrayList<Integer> list, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            list.add(root.data);
        }
        else{
            KDistanceNodes(root.left, list, k - 1);
            KDistanceNodes(root.right, list, k - 1);
        }
    }

    static ArrayList<Integer> printSolution(Node root, int k){
        ArrayList<Integer> list = new ArrayList<>();
        KDistanceNodes(root, list, k);
        return list;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.right.left = new Node(5);
        node.right.right = new Node(6);
        node.left.left.right = new Node(8);

        int k = 2;

        System.out.println(printSolution(node, k));
    }
}
