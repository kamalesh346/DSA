package Stack.Stackarr;

public class Main {
    public static void main(String args[]){
        Stack s=new Stack(7);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        s.display();
        s.push(100);
        s.push(200);
        s.display();
    }
}
