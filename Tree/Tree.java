package Tree;

import java.util.*;

public class Tree {
    Node root;
    Queue<Node> q=new LinkedList<>();
    public class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }    
    public Tree(int val){
        root= new Node(val);
    }
    public void insertLeft(Node node,  int val){
        node.left=new Node(val);
    }
    public void insertRight(Node node,  int val){
        node.right=new Node(val);
    }
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");;
        }
    }
    public int height(Node n){
        if(n==null)return 0;
        int l=height(n.left);
        int r=height(n.right);
        return Math.max(l,r)+1;
    }
    public int countNode(Node n){
        if(n==null)return 0;
        int l=countNode(n.left);
        int r=countNode(n.right);
        return l+r+1;
    }
     public int countLeaf(Node n){
        if(n==null)return 0;
        if(n.left==null && n.right==null)return 1;
        int l=countLeaf(n.left);
        int r=countLeaf(n.right);
        return l+r;
    }
    public boolean search(Node n, int val){
        if(n==null)return false;
        if(n.val==val)return true;
        boolean l=search(n.left,val);
        boolean r=search(n.right,val);
        return l||r;
    }
    public boolean isBalanced(Node root) {
        if(root==null)return true;
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1)return false; 
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public void insert(int val){
        Node newNode=new Node(val);
        if(root==null){
            root=newNode;
            q.add(root);
            return;
        }Node temp=q.peek();
        if(temp.left==null){
            temp.left=newNode;
            q.add(temp.left);
            return;
        }else if(temp.right==null){
            temp.right=newNode;
            q.add(temp.right);
            q.poll();
            return;
        }
    }
    public void lvl_order(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }System.out.println();
    }
}
