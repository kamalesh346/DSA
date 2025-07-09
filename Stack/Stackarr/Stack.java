package Stack.Stackarr;
public class Stack {
    int arr[];
    int s,top;
    Stack(int s){
        this.s=s;
        arr=new int[s];
        top=-1;
    }public void push(int val){
        if(top==arr.length-1){
            System.out.println("Stack overflow");
            return;
        }else{
            arr[++top]=val;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }return arr[top--];
    }    
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }return arr[top];
    }
    public boolean isFull(){
        return top==arr.length-1;
    }public boolean isEmpty(){
        return top==-1;
    }public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
