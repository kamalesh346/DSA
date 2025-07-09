package LL.CircularDLL;

public class Main {
    public static void main(String[] args) {
        CircularDLL l = new CircularDLL();

        l.addAtBeg(10);
        l.addAtEnd(40);
        l.addAt(1, 20);
        l.addAt(2, 30);
        l.addAt(1, 15);
        // l.deleteAtBeg();
        l.deleteAt(2);
        l.display();
    }
}
