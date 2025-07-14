package Queue_using_Stack.costly_Enqueue;

public class Main {
    public static void main(String args[]){
        costly_Enqueue ce=new costly_Enqueue();
        ce.enqueue(10);
        ce.enqueue(20);
        ce.enqueue(30);
        ce.display();  

        System.out.println("Dequeued: " + ce.dequeue());  
        ce.display();
    }
}
