package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class implementation2 {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int val) {
            data = val;
        }
    }

    public static void nthlevel(Node root, int n) {
        if (root == null) return;
        if (n == 1) System.out.println(root.data);
        nthlevel(root.left, n - 1);
        nthlevel(root.right, n - 1);
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static Node constructByBFS(String arr[]) {
        if (arr.length == 0) return null; // edge case for empty array

        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        int n = arr.length;

        while (i < n) {
            Node temp = q.remove();

           
            if (i < n && !arr[i].equals("")) {
                int l = Integer.parseInt(arr[i]);
                temp.left = new Node(l);
                q.add(temp.left);
            }
            i++;

           
            if (i < n && !arr[i].equals("")) {
                int r = Integer.parseInt(arr[i]);
                temp.right = new Node(r);
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        String arr[] = {"1", "2", "3", "4", "766", "5"};
        Node root = constructByBFS(arr);
        int level = height(root);
        for (int i = 1; i <= level; i++) {
            nthlevel(root, i);
        }
    }
}
