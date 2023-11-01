package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {
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

    static ArrayList<ArrayList<Integer>> lineByLine(Node node){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(node == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++){
                Node currNode = queue.remove();
                list.add(currNode.data);

                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add(list);
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
        node.left.left.right = new Node(8);

        System.out.println(lineByLine(node));
    }
}
