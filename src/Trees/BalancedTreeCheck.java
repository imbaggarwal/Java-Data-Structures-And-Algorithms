package Trees;

public class BalancedTreeCheck {
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

    static boolean isBalanced(Node root){
        return height(root) >= 0;
    }

    private static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        if(leftHeight == -1){
            return - 1;
        }

        int rightHeight = height(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        else{
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);

        System.out.println(isBalanced(node) ? "Tree is Balanced" : "Tree is Not Balanced");
    }
}
