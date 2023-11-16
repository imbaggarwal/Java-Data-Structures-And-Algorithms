package Trees;

import java.util.ArrayList;
import java.util.Stack;

//Question: https://www.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/0

//Solution:
public class SpiralFormBFS {
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

    static ArrayList<Integer> spiral(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while(!stack1.isEmpty()){
                Node temp = stack1.pop();
                list.add(temp.data);

                if(temp.right != null){
                    stack2.push(temp.right);
                }
                if(temp.left != null){
                    stack2.push(temp.left);
                }
            }

            while(!stack2.isEmpty()){
                Node temp = stack2.pop();
                list.add(temp.data);

                if(temp.left != null){
                    stack1.push(temp.left);
                }
                if(temp.right != null){
                    stack1.push(temp.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left = new Node(7);

        System.out.println(spiral(root));
    }
}
