package Tree;

public class Main {
    public static void main(String args[]){
        Tree t=new Tree(10);
        t.insertLeft(t.root,5);
        t.insertRight(t.root,15);
        t.insertLeft(t.root.left,3);
        t.insertRight(t.root.left,8);
        t.insertLeft(t.root.right,12);
        t.preOrder(t.root);System.out.println();
        t.inOrder(t.root);
        System.out.println();
        t.postOrder(t.root);
        System.out.println();
        System.out.println(t.search(t.root,30));
        System.out.println(t.countNode(t.root));
        System.out.println(t.countLeaf(t.root));
    }
}
