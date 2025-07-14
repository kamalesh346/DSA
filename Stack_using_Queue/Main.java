package Stack_using_Queue;

public class Main {
    public static void main(String[] args) {
    StackusingQueueLL s = new StackusingQueueLL();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.peek());  // Output: 30
    System.out.println(s.pop());   // Output: 30
    System.out.println(s.peek());  // Output: 20
}
} 
