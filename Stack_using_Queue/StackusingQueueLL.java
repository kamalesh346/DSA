package Stack_using_Queue;

import java.util.*;

public class StackusingQueueLL{
    Queue<Integer> q;
    StackusingQueueLL(){
        q=new LinkedList<>();
    }
    public void push(int val){
        q.add(val);
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
    }public int pop(){
        return q.remove();
    }public int peek(){
        return q.peek();
    }
}