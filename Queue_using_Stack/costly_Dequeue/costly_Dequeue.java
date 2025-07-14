package Queue_using_Stack.costly_Dequeue;

import java.util.Stack;

public class costly_Dequeue{
    Stack<Integer>s1;
    Stack<Integer>s2;
    costly_Dequeue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void enqueue(int val){
        s1.push(val);
    }public int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }return s2.pop();
    }
    public void display() {
//     if (s1.isEmpty() && s2.isEmpty()) {
//         System.out.println("Queue is Empty");
//         return;
//     }
    
//     // Print elements in s2 (they are in correct order already)
//     for (int i = s2.size() - 1; i >= 0; i--) {
//         System.out.print(s2.get(i) + " ");
//     }

//     // Print elements in s1 (need to print from bottom to top)
//     for (int i = 0; i < s1.size(); i++) {
//         System.out.print(s1.get(i) + " ");
//     }

//     System.out.println();
}

}