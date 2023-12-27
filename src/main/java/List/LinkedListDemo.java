package List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("Alice");
		link.add("Bob");
		link.add("Steve");
		link.add("Richard");
		link.addFirst("Jack");
		link.addLast("Victor");
		System.out.println("Print all the elements in the list " + link);
		link.remove(2);
		System.out.println("print the elements after remove in the list : " +link);
		System.out.println("print the size of elements in the list : " + link.size());
		
		LinkedList<String> list1= new LinkedList<>();
		list1.add("kirthika");
		list1.add("Arun");
		list1.add(2,"Athiran");
		list1.addAll(link);		
		System.out.println(list1);
	}

}
