package Trees;

import java.util.LinkedList;
import java.util.Queue;

//Question: https://www.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/1

//Solution:
public class TreeFromParentArray {
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

    static Node createTree(int[] parent, int n){
        Node[] arr = new Node[n];

        for(int i=0; i<n; i++){
            arr[i] = new Node(i);
        }

        Node root = null;

        for(int i=0; i<n; i++){
            if(parent[i] == -1){
                root = arr[i];
                continue;
            }
            if(arr[parent[i]].left == null){
                arr[parent[i]].left = arr[i];
            }
            else{
                arr[parent[i]].right = arr[i];
            }
        }
        return root;
    }

    static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            System.out.print(currNode.data + " ");

            if(currNode.left != null){
                queue.add(currNode.left);
            }
            if(currNode.right != null){
                queue.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] parent = {2,0,-1};
        int n = parent.length;

        Node root = createTree(parent, n);
        BFS(root);
    }
}
