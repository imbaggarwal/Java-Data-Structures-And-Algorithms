package Trees;

import java.util.LinkedList;
import java.util.Queue;

//Question: https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1

//Solution:
public class MaxWidthOfTree {
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

    static int getMaxWidth(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int maxWidth = 0;

        while(!queue.isEmpty()){
            int currWidth = queue.size();
            maxWidth = Math.max(maxWidth, currWidth);

            for(int i=0; i<currWidth; i++){
                Node curr = queue.remove();

                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.right = new Node(3);
        node.left.left = new Node(4);
        node.right = new Node(5);
        node.right.right = new Node(6);

        System.out.println(getMaxWidth(node));
    }
}
