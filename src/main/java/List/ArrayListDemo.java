package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	int id;
	String name;
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//Add the ArrayList
        list.add("20");
        list.add("java");
        list.add("40");
        list.add("50");
        list.add("60");
        list.add("70");
        System.out.println("Total list : " + list.size());
        System.out.println(list);
        
        //Access the ArrayList
        System.out.println("Access the ArrayList : " + list.get(2));
        
        //Change the ArrayList
        System.out.println("Change the ArrayList :" + list.set(1,"Update"));
        System.out.println(list);
        
        //Remove the ArrayList
        System.out.println("Remove the ArrayList : " + list.remove(4));
        System.out.println(list);
        
        list.clone();
        System.out.println("Clone the Arraylist : " + list);
        
        System.out.println("Empty value or not : " + list.isEmpty());
        
        String str ="Hello world";
        int index=str.indexOf("l"); //indexOf - find the first occurrence of index position
        System.out.println("Find the index position: " + index);
        
        String substring= str.substring(8); //substring - extract the portion of substring
        System.out.println("Substring is : " + substring);
        
        boolean contains=str.contains("wor"); // contains - to check certain sequence of character in the string
        System.out.println("contains ? : " + contains);
        
	}
		
	}

