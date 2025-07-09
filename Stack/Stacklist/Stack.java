package Stack.Stacklist;
public class Stack {
    Node top;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Stack(){
        top=null;
    }
    public void push(int val){
       Node newNode=new Node(val);
       if(top==null){
            top=newNode;
            return;
       }newNode.next=top;
       top=newNode;
    }
    public int pop(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }int popped=top.data;
        top=top.next;
        return popped;
    }    
    public int peek(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }return top.data;
    }
    public void display(){
       if(top==null){
            System.out.println("stack is empty");
            return;
       } Node curr=top;
       while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
       }System.out.println();
    }
}
