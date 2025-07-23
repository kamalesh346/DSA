public class BST {
    Node root;
    class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public BST(int val){
        root=new Node(val);
    }
    // iterative insert
    // public void insert(int val){
    //     Node newNode=new Node(val);
    //     Node curr=root;
    //     while(curr!=null){
    //         if(curr.data<val){
    //             if(curr.right==null){
    //                 curr.right=newNode;
    //                 break;
    //             }curr=curr.right;
    //         }else if(curr.data>val){
    //             if(curr.left==null){
    //                 curr.left=newNode;
    //                 break;
    //             }curr=curr.left;
    //         }else {
    //             break;
    //         }
    //     }
    // }
    public void insert(int val){
        root=helper(root,val);
    }
    public Node helper(Node n,int val){
        if(n==null){
            return new Node(val);
        }else if(n.data>val){n.left=helper(n.left,val);}
        else if(n.data<val){n.right=helper(n.right,val);}
        return n;
    }
    public Node delete(Node n,int val){
        if(n==null)return null;
        else if(n.data<val)n.right=delete(n.right,val);
        else if(n.data>val)n.left=delete(n.left,val);
        else {
            if(n.left==null && n.right==null)return null;
            else if(n.left==null)return n.right;
            else if(n.right==null)return n.left;
            else{                                             
                Node min=findmin(n.right);
                n.data=min.data;
                n.right=delete(n.right, min.data);
            }
        }return n;
    }
    public Node findmin(Node n){
        while(n.left!=null)n=n.left;
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
