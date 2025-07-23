// delete function
package AVL;

public class AVL {
    Node root;
    class Node{
        int data,h;
        Node right,left;
        Node(int data){
            this.data=data;
            right=left=null;
            h=0;
        }
    }
    public AVL(int val){
        root=new Node(val);
    }
    private int getHeight(Node n){
        if(n==null)return -1;
        return n.h;
    }
    private int BF(Node n){
        if(n==null)return 0;
        return getHeight(n.left)-getHeight(n.right);
    }
    private Node rightRotate(Node z){
        Node y=z.left;
        Node t3=y.right;
        y.right=z;
        z.left=t3;
        return y;
    }
    private Node leftRotate(Node z){
        Node y=z.right;
        Node t3=y.left;
        y.left=z;
        z.right=t3;
        return y;
    }
    public void insert(int val){
        root=helper(root,val);
    }
    public Node helper(Node n,int val){
        if(n==null){
            return new Node(val);
        }else if(n.data>val){n.left=helper(n.left,val);}
        else if(n.data<val){n.right=helper(n.right,val);}
        n.h=1+Math.max(getHeight(n.left),getHeight(n.right));
        int bf=BF(n);
        if(bf>1 && val<n.left.data){
            return rightRotate(n);
        }else if(bf>1 && val>n.left.data){
            n.left=leftRotate(n);
            return rightRotate(n);
        }else if(bf<-1 && val<n.right.data){
            n.right=rightRotate(n);
            return leftRotate(n);
        }else if(bf<-1 && val>n.right.data){
            return leftRotate(n);
        }

        return n;
    }
    public void inorder(Node n){
        if(n!=null){
            inorder(n.left);
            System.out.print(n.data+" ");
            inorder(n.right);
        }
    }
    public void postorder(Node n){
        if(n!=null){
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.data+" ");
        }
    }
    public void preorder(Node n){
        if(n!=null){
            System.out.print(n.data+" ");
            preorder(n.left);            
            preorder(n.right);
        }
    }
    public boolean search(Node n, int val){
        if(n==null)return false;
        if(n.data==val)return true;
        if(n.data<val)return search(n.right,val); 
        else return search(n.left, val);
    }
}