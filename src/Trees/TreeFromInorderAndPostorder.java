package Trees;

//Question: https://practice.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1

//Solution:
public class TreeFromInorderAndPostorder {
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

    static Node solve(int[] in, int[] post, int inStart, int inEnd, int postStart, int postEnd){
        if(inStart > inEnd){
            return null;
        }

        Node root = new Node(post[postEnd]);
        int i = inStart;

        for(; i<=inEnd; i++){
            if(in[i] == root.data){
                break;
            }
        }

        int leftSize = i - inStart;
        int rightSize = inEnd - i;

        root.left = solve(in, post, inStart, i - 1, postStart, postStart + leftSize - 1);
        root.right = solve(in, post, i + 1, inEnd, postEnd - rightSize, postEnd - 1);

        return root;
    }

    static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    static Node buildTree(int[] in, int[] post, int n) {
        return solve(in, post, 0, n - 1, 0, n- 1);
    }

    public static void main(String[] args) {
        int[] in = {4,8,2,5,1,6,3,7};
        int[] post = {8,4,5,2,6,7,3,1};
        int n = in.length;

        Node root = buildTree(in, post, n);
        preOrder(root);
    }
}
