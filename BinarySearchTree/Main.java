public class Main {
    public static void main(String args[]){
        BST bst=new BST(50);
        bst.insert(100);
        bst.insert(60);
        bst.insert(20);
        bst.insert(30);
        bst.insert(10);
        bst.insert(80);
        System.out.print("Inorder:");
        bst.inorder(bst.root);
        System.out.println();
        System.out.print("postorder:");
        bst.postorder(bst.root);
        System.out.println();
        System.out.print("preorder:");
        bst.preorder(bst.root);
        System.out.println();
        System.out.println(bst.search(bst.root,200));
        System.out.println(bst.search(bst.root,80));
    }
}
