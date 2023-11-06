package Trees;

//Question: https://practice.geeksforgeeks.org/problems/check-if-subtree/1

//Solution:
public class SubTree {
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

    static boolean isSubtree(Node T, Node S){
        if(T == null){
            return false;
        }

        boolean x = isSubtree(T.left, S);
        boolean y = isSubtree(T.right, S);

        if(T.data == S.data){
            if(check(T, S)){
                return true;
            }
        }
        return (x || y);
    }

    static boolean check(Node T, Node S){
        if(T == null || S == null){
            return (T == S);
        }

        if(T.data != S.data){
            return false;
        }

        boolean x = check(T.left, S.left);
        boolean y = check(T.right, S.right);

        return (x && y);
    }

    public static void main(String[] args) {
        Node treeOne = new Node(1);
        treeOne.left = new Node(2);
        treeOne.right = new Node(3);
        treeOne.left.left = new Node(5);
        treeOne.left.right = new Node(6);
        treeOne.right.left = new Node(4);

        Node treeTwo = new Node(3);
        treeTwo.left = new Node(4);

        System.out.println(isSubtree(treeOne, treeTwo) ? "Second Tree is a Sub Tree" : "Second Tree is Not a Sub Tree");
    }
}
