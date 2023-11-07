package Trees;

//Question: https://practice.geeksforgeeks.org/problems/foldable-binary-tree/1

//Solution:
public class FoldableTree {
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

    private static boolean isMirror(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 == null || node2 == null){
            return false;
        }

        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    static boolean isFoldable(Node node){
        if(node == null){
            return true;
        }

        return isMirror(node.left, node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.right.right = new Node(5);

        System.out.println(isFoldable(node) ? "Tree is Foldable" : "Tree is Not Foldable");
    }
}
