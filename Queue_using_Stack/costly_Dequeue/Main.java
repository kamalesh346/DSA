package Queue_using_Stack.costly_Dequeue;

public class Main {
    public static void main(String args[]){
        costly_Dequeue cd=new costly_Dequeue();
        cd.enqueue(10);
        cd.enqueue(20);
        cd.enqueue(30);
        cd.display();  
        System.out.println("Dequeued: " + cd.dequeue());  
        cd.display();
    }
}
