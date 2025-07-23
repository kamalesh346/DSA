

public class DLL {
    Node head;
    static int size;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    // public void insertBeg(int data){
    //     Node newNode=new Node(data);
    //     if(head==null)head=newNode;
    //     else{
    //         head.prev=newNode;
    //         newNode.next=head;
    //         head=newNode;
    //     }
    //     size+=1;
    // }
    // public void insertEnd(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=newNode;
    //         return;
    //     }
    //     Node curr=head;
    //     while(curr.next!=null){
    //         curr=curr.next;
    //     }curr.next=newNode;
    //     newNode.prev=curr;
    //     size+=1;
    // }
    // public void insertAt(int ind,int data){
    //     if(ind==0){
    //         insertBeg(data);
    //         return;
    //     }
    //     if(head==null){System.out.print("List is empty");return;}
    //     int i=0;
    //     Node curr=head;
    //     Node newNode = new Node(data);
    //     while(i+1<ind && curr!=null){
    //         curr=curr.next;
    //         i++;
    //     }if(curr!=null && curr.next!=null){
    //         newNode.next=curr.next;
    //         curr.next.prev=newNode;
    //         newNode.prev=curr;
    //         curr.next=newNode;
    //     }else if(curr!=null && curr.next==null && i+1==ind){
    //         curr.next=newNode;
    //         newNode.prev=curr;
    //     }
    //     else {
    //         System.out.print("Invalid index\n");
    //     }
    //     size+=1;
    // }
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else if(head.data>=data){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
        }Node curr=head;
        while(curr.next!=null && curr.next.data<data){
            curr=curr.next;
        }newNode.next=curr.next;
        if(curr.next!=null){
            curr.next.prev=newNode;
        }curr.next=newNode;
        newNode.prev=curr;
    }
    public void deleteBeg(){
        if(head==null)throw new RuntimeException( "Error list is empty");
        if(head.next==null){
            head=null;
            return;
        }head=head.next;
        head.prev=null;
        size-=1;
    }
    public void deleteEnd(){
        if(head==null)throw new RuntimeException( "Error list is empty");
        if(head.next==null){
            head=null;
            return;
        }Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }curr.next=null;
        size-=1;
    }
    public void deleteAt(int ind){
        if(head==null)throw new RuntimeException( "Error list is empty");
        if(ind==0){
            deleteBeg();
            return;
        }
        Node curr=head;
        int i=0;
        while(i+1<ind && curr!=null){
            curr=curr.next;
            i++;
        }if(curr==null || curr.next==null){
            System.out.println("Invalid Index");
            return;
        }Node todel=curr.next;
        curr.next=todel.next;
        if(todel.next!=null){
            todel.next.prev=curr;
        }
        size-=1;
    }
    public void display(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr=head,tail=null;
        System.out.print("Forward: ");
        while(curr!=null){
            System.out.print(curr.data+"->");
            tail=curr;
            curr=curr.next;
        }System.out.println("Null");
        System.out.print("Backward: ");
        while(tail!=null){
            System.out.print(tail.data+"->");
            tail=tail.prev;
        }System.out.print("Null");
    }
}
