package NaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTree {
    Node root;
    class Node{
        int val;
        List<Node> children;
        Node(int val){
            this.val=val;
            children=new ArrayList<>();
        }
    }
    NaryTree(int val){
        root=new Node(val);
    }
    public Node insert(Node n,int val){
        Node child=new Node(val);
        n.children.add(child);
        return child;
    }
    public void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.val+" ");
        for(Node n:root.children)preOrder(n);
    }
    public void postOrder(Node root){
        if(root==null)return;
        for(Node n:root.children)postOrder(n);
        System.out.println(root.val+" ");
        
    }
    public void lvl_order(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp=q.poll();
            for(Node n:temp.children)q.add(n);
            System.out.println(temp.val+" ");
        }
    }
    public int height(Node root){
        if(root==null)return 0;
        int h=1;
        for(Node n:root.children){
            h=Math.max(h,height(n));
        }return h;
    }
    public int countNodes(Node root){
        if(root==null)return 0;
        int count=1;
        for(Node n:root.children)count+=countNodes(n);
        return count;
    }
}
