package Queue.Queuelist;

import Queue.Queuelist.Queuelist;

public class Main {
    public static void main(String args[]){
        Queuelist q = new Queuelist();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();      
        System.out.println(q.dequeue());  
        q.display();            
    }
}
