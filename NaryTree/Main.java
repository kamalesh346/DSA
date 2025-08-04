package NaryTree;

public class Main{
    public static void main(String[] args) {
        NaryTree tree = new NaryTree(1);  // root node

        // Build Tree:
        NaryTree.Node child2 = tree.insert(tree.root, 2);
        NaryTree.Node child3 = tree.insert(tree.root, 3);
        NaryTree.Node child4 = tree.insert(tree.root, 4);

        tree.insert(child2, 5);
        tree.insert(child2, 6);
        tree.insert(child3, 7);
        NaryTree.Node child8 = tree.insert(child3, 8);
        tree.insert(child4, 9);
        tree.insert(child8, 10);

        // Tree Structure:
        //         1
        //     /   |   \
        //    2    3    4
        //   / \  / \    \
        //  5  6 7  8     9
        //           \
        //           10

        System.out.println("Preorder:");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder:");
        tree.postOrder(tree.root);

        System.out.println("\nLevel Order:");
        tree.lvl_order(tree.root);

        System.out.println("\nTotal Nodes:");
        System.out.println(tree.countNodes(tree.root));  

        System.out.println("\nHeight:");
        System.out.println(tree.height(tree.root));  
    }
}