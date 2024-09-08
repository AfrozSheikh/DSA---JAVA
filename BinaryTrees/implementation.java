package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static class Node {
        int data ; 
        Node right ; 
        Node left ;
        Node(int val){
            data = val ;} 
    }

    static void display(Node head){
        if(head==null) return ;
        System.out.print(head.data + " ->");
   
      if(head.left!=null)  System.out.print(head.left.data);
      if(head.right!=null)   System.out.print(head.right.data );
      System.out.println();
        display(head.left);
        display(head.right);;
    }

    public static int size(Node root){
        if(root == null) return 0 ; 
        return 1+ size(root.left)+ size(root.right) ;
    }
    public static int sum(Node root){
        if(root == null) return 0 ; 
        return root.data+ sum(root.left)+ sum(root.right) ;

    }

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE ; 
        int a = root.data ;
        int b= max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(c, b));
    }

    public static int height(Node root){
        if(root == null) return 0 ; 
        if(root.right==null && root.right==null) return 0 ; 
        return 1+ Math.max(height(root.left), height(root.right)) ;
    }

    public static void preOrder(Node root){
        if (root == null) return  ;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void nthlevel(Node root ,int n ){
        if (root == null) return  ;
        if(n==1)System.out.println(root.data);
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }

    static void bfs(Node root){
      Queue<Node> q = new LinkedList<>() ; 

      if(root!=null)q.add(root);

      while (q.size()>0) {
        Node temp = q.peek() ; 
        if(temp.left!=null) q.add(temp.left) ; 
        if(temp.right!=null) q.add(temp.right) ; 
        System.out.print(temp.data+" ");
        q.remove() ; 
        
      }   
    
    }
    public static void main(String[] args) {
        Node root = new Node(1) ; 
        Node a = new Node(2) ;
        root.left =a ; 
        Node b = new Node(3) ;
        root.right =b ;
        Node c = new Node(4) ;
        Node d = new Node(5) ;
        a.right =d  ; 
        a.left =c ; 
        Node e = new Node(6) ;
        b.left = e ; 
        Node f = new Node(7) ;
        b.right = f ; 
     bfs(root);
    
    
    }
}
