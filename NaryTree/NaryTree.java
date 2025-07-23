package NaryTree;

import java.util.ArrayList;
import java.util.List;

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
    public void inser(Node n,int val){
        n.children.add(new Node(val));
    }
    public void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.val+" ");
        for(Node n:root.children)preOrder(n);
    }public int countNodes(Node root){
        if(root==null)return 0;
        int count=1;
        for(Node n:root.children)count+=countNodes(n);
        return count;
    }
}
