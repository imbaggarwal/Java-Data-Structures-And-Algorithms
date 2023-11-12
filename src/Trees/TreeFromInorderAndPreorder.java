package Trees;

//Question: https://practice.geeksforgeeks.org/problems/construct-tree-1/1

//Solution:
public class TreeFromInorderAndPreorder {
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

    static int findIndex(int[] arr, int start, int target){
        int i=0;
        while( arr[start+i] != target ) i++;
        return i;
    }

    public static Node buildUtil(int[] inorder, int[] preorder, int inStart, int preStart, int n){
        if(n==0) {
            return null;
        }

        Node ret = new Node( preorder[preStart] );

        int i = findIndex( inorder, inStart, preorder[preStart] );

        ret.left = buildUtil( inorder, preorder, inStart, preStart+1, i );
        ret.right = buildUtil( inorder, preorder, inStart+i+1, preStart+i+1, n-i-1 );

        return ret;
    }

    public static Node buildTree(int[] inorder, int[] preorder, int n){
        return buildUtil(inorder, preorder, 0, 0, n);
    }

    static void postordrer(Node root)
    {
        if(root == null)
            return;

        postordrer(root.left);
        postordrer(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] inorder = {3,1,4,0,5,2};
        int[] preorder = {0,1,3,4,2,5};
        int n = inorder.length;

        Node root = buildTree(inorder, preorder, n);
        postordrer(root);
    }
}
