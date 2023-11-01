package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1

//Solution:
public class ZigZagTraversal {
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

    static ArrayList<Integer> zigZagTraversal(Node root){
        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        boolean leftToRight = true;
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                Node currNode = queue.remove();
                if(leftToRight){
                    result.add(currNode.data);
                }
                else{
                    stack.push(currNode);
                }

                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }

            while(!stack.isEmpty()){
                result.add(stack.pop().data);
            }

            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left.left = new Node(8);
        node.left.left.right = new Node(9);

        System.out.println(zigZagTraversal(node));
    }
}
