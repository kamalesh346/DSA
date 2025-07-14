package Queue_using_Stack.costly_Enqueue;

import java.util.Stack;

public class costly_Enqueue{
    Stack<Integer>s1;
    Stack<Integer>s2;
    costly_Enqueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void enqueue(int val){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }s1.push(val);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }public int dequeue(){
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }
    public void display(){
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }System.out.println("Queue : "+s1);
    }
}