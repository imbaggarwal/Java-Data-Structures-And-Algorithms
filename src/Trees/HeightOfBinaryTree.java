package Trees;

//Question: https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1

//Solution:
public class HeightOfBinaryTree {
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

    static int heightOfTree(Node node){
        if(node == null){
            return 0;
        }
        else{
            return Math.max(heightOfTree(node.left), heightOfTree(node.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(2);
        node.right = new Node(1);
        node.right.left = new Node(3);

        System.out.println(heightOfTree(node));
    }
}
