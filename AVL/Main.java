package AVL;

public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.inorder(tree.root);  // Should be balanced and sorted
    }
}

