package Queue.Queuearr;

public class Main {

    public static void main(String args[]){
        Queuearr queue=new Queuearr(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display();
        
    }
}
