package Queue.Queuearr;

public class Queuearr {
    int arr[];
    int front,rear,size;
    public Queuearr(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public void enqueue(int val){
        if((rear+1)%size==front)throw new IndexOutOfBoundsException("Queue is full");
        if(rear==-1)front=0;
        rear=(rear+1)%size;
        arr[rear]=val;
    }
    public int dequeue(){
        if(front==-1)throw new IndexOutOfBoundsException("Queue is Empty");
        int val=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return val;
    }
    public void display(){
        if(front==-1){
            System.out.print("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
        // for(int i=front;(i%size)!=front;i++){
        //     System.out.print(arr[i]+" ");
        // }System.out.println();
    }
}
