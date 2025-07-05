public class CircularSLL {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void addAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            size++;
            return;
        }Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }curr.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            size++;
            return;
        }Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }curr.next=newNode;
        newNode.next=head;
        size++;
    }
    public void addAt(int ind, int data){
        if (ind < 0 || ind > size) {
            System.out.println("Invalid index");
            return;
        }Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            size++;
            return;
        }if(ind==0){
            addAtBeg(data);
            return;
        }if(ind==size){
            addAtEnd(data);
            return;
        }Node curr=head;
        int i=0;
        while(i+1<ind && curr.next!=head){
            curr=curr.next;
            i++;
        }if(i+1==ind){
            newNode.next=curr.next;
            curr.next=newNode;
            size++;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }Node curr=head;
        do{
            System.out.print(curr.data+"->");
            curr=curr.next;
        }while(curr!=head);
        System.out.println();
    }
}
