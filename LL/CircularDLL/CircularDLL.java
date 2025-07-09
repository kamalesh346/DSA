package LL.CircularDLL;

public class CircularDLL {
    Node head;
    int s=0;
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void addAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            head.prev=head;
            s++;
            return;
        }
        newNode.next=head;
        head.prev.next=newNode;
        newNode.prev=head.prev;
        head.prev=newNode;
        head=newNode;
        s++;
    }public void addAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            head.prev=head;
            s++;
            return;
        }
        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;
        s++;
    }
    public void addAt(int ind,int data){
        if(ind<0 || ind>s){
            System.out.print("Invalid index");
            return;
        }if(ind==0){
            addAtBeg(data);
            return;
        }if(ind==s){
            addAtEnd(data);
            return;
        }Node newNode=new Node(data);
        Node curr=head;
        for(int i=0;i+1<ind;i++)curr=curr.next;
        newNode.next=curr.next;
        newNode.prev=curr;
        curr.next.prev=newNode;
        curr.next=newNode;
        s++;
    }
    public void deleteAtBeg(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
        }else{
            head.prev.next=head.next;
            head.next.prev=head.prev;
            head=head.next;
        }s--;
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
        }else{
            head.prev.prev.next=head;
            head.prev=head.prev.prev;
        }s--;
    }
    public void deleteAt(int ind){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(ind<0 || ind>=s){
            System.out.println("Invalid index");
            return;
        }if(ind==0){deleteAtBeg();return;}
        else if(ind==s-1){deleteAtEnd();return;}
        else{
            Node curr=head;
            for(int i=0;i+1<ind;i++)curr=curr.next;
            curr.next=curr.next.next;
            curr.next.prev=curr;
        }s--;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        do{
            System.out.print(curr.data+"->");
            curr=curr.next;
        }while(curr!=head);
    }
}
