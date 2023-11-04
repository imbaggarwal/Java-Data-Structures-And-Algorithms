package Trees;

//Question: https://practice.geeksforgeeks.org/problems/children-sum-parent/1

//Solution:
public class ChildrenSumProperty {
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

    static boolean sumProperty(Node root){
        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        int sum = 0;

        if(root.left != null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum += root.right.data;
        }

        return (root.data == sum && sumProperty(root.left) && sumProperty(root.right));
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(8);
        node.right = new Node(2);
        node.right.left = new Node(2);
//        node.right.left = new Node(1);

        System.out.println(sumProperty(node));
    }
}
