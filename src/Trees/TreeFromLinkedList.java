package Trees;

import java.util.LinkedList;
import java.util.Queue;

//Question: https://practice.geeksforgeeks.org/problems/make-binary-tree/1

//Solution:
public class TreeFromLinkedList {
    static class llNode{
        int data;
        llNode next;

        public llNode(int data){
            this.data = data;
            next = null;
        }
    }

    static class treeNode{
        int data;
        treeNode left;
        treeNode right;

        public treeNode(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static treeNode constructTree(llNode head){
        Queue<treeNode> queue = new LinkedList<>();
        if (head == null){
            return null;
        }

        treeNode node = new treeNode(head.data);
        queue.add(node);
        head = head.next;
        while (head != null)
        {
            treeNode parent = queue.remove();
            parent.left = new treeNode(head.data);
            queue.add(parent.left);
            head = head.next;
            if (head != null)
            {
                parent.right = new treeNode(head.data);
                queue.add(parent.right);
                head = head.next;
            }
        }
        return node;
    }

    static void BFS(treeNode root){
        Queue<treeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            treeNode curr = queue.poll();
            System.out.print(curr.data + " ");

            if(curr.left != null){
                queue.offer(curr.left);
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        llNode node = new llNode(10);
        node.next = new llNode(12);
        node.next.next = new llNode(15);
        node.next.next.next = new llNode(25);
        node.next.next.next.next = new llNode(30);
        node.next.next.next.next.next = new llNode(36);

        treeNode root = constructTree(node);
        BFS(root);
    }
}
