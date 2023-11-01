package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Question: https://practice.geeksforgeeks.org/problems/level-order-traversal/1

//Solution:
public class LevelOrderTraversalBFS {
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

    static ArrayList<Integer> BFS(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            list.add(currNode.data);

            if(currNode.left != null){
                queue.offer(currNode.left);
            }
            if(currNode.right != null){
                queue.offer(currNode.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(40);
        node.left.right = new Node(60);

        System.out.println(BFS(node));
    }
}
