package Queue.Queuelist;

public class Queuelist {
    Node front,rear;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Queuelist(){
        front=null;
        rear=null;
    }
    public void enqueue(int val){
       Node newNode=new Node(val);
       if(front==null){
            front=newNode;
            rear=newNode;
       }else{
        rear.next=newNode;
        rear=newNode;
       }
    }
    public int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }int temp=front.data;
        front=front.next;
        if(front==null)rear=null;
        return temp;
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }Node curr=front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}
