package LL.LinkedList;
public class LinkedList {
	Node head;
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }       
	public void add(int data) {
		Node newnode=new Node(data);
		if(head==null) { 
			head=newnode;
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}current.next=newnode;
		}
	}
	public void deleteFirst() {
		if(head==null) {System.out.print("no elements to delete");return;}
		else {
			head=head.next;
		}
	}
	public void deleteLast() {
		if(head==null) {System.out.print("no elements to delete");return;}
		else if(head.next==null){head=null;}
		else {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}curr.next=null;
		}

	}
	public void delete(int d) {
	    if (head == null) {
	        System.out.println("No elements to delete");
	        return;
	    }

	    if (head.data == d) {
	        head = head.next; // Delete head
	        return;
	    }

	    Node curr = head;
	    while (curr.next != null && curr.next.data != d) {
	        curr = curr.next;
	    }

	    if (curr.next == null) {
	        System.out.println("Element not found");
	        return;
	    }

	    curr.next = curr.next.next; // Delete the node
	}
	
	public int search(int d) {
		if(head==null)return -1;
		if(head.data==d)return 0;
		Node prev=head;
	    Node curr = head.next;
	    int i = 1;
	    while (curr != null && curr.data != d) {
	    	prev=prev.next;
	        curr = curr.next;
	        i++;
	    }
	    if (curr != null) {
	    	prev.next=curr.next;
	    	curr.next=head;
	    	head=curr;
	        return i;
	    }
	    return -1;
	}

	
	
	public void deleteAt(int ind) {
	    if (head == null) {
	        System.out.println("List found empty");
	        return;
	    }

	    if (ind == 0) {
	        head = head.next;  // delete first node
	        return;
	    }

	    Node curr = head;
	    for (int i = 0; i < ind - 1; i++) {
	        if (curr == null || curr.next == null) {
	            System.out.println("Index out of bounds");
	            return;
	        }
	        curr = curr.next;
	    }

	    if (curr.next == null) {
	        System.out.println("Index out of bounds");
	        return;
	    }

	    curr.next = curr.next.next;  // skip the node at index
	}
	public int max(){
		if(head==null){
			throw new RuntimeException("List is empty");
		}
		Node curr=head;
		int max=Integer.MIN_VALUE;
		while(curr!=null){
			if(max<curr.data)max=curr.data;
			curr=curr.next;
		}return max;
	}

	public String isSorted(){
		if(head==null)return "Empty list";
		Node curr=head;
		boolean asc=true,desc=true;
		while(curr.next!=null){
			if(curr.data<curr.next.data)desc=false;
			else if(curr.data >curr.next.data)asc=false;
			curr=curr.next;
		}return (asc?"asc":(desc)?"desc":"not sorted");

	}
	public void display() {
		if(head==null) {
			System.out.println("nothing to display list is empty");
		    return;
		}
		Node current = head; // Start from the head
        while (current.next != null) { // Traverse the list
            System.out.print(current.data + " -> "); // Print the data
            current = current.next; // Move to the next node
        }System.out.println(current.data+" -> ");
        System.out.println("null"); // Indicate the end of the list
	}
}
