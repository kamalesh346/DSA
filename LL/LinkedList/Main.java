package LL.LinkedList;
public class Main {
	public static void main(String args[]) {
		LinkedList list= new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		
		System.out.println("Initial list---");
		list.display();

        // list.display();
        // System.out.println(list.search(50));
		System.out.println(list.isSorted());

	}
}
