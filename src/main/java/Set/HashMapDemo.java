package Set;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//Create an empty hash map by declaring object of string and integer type
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Arun", 100);
		hm.put("priya",101);
		hm.put("Kirthika",102);
		hm.put("Athiran",104);
		System.out.println(hm + " - " + hm.size());
		
		//Checking if a key is present and if present, print value by passing random element
		if(hm.containsKey("Kirthika")) {
		Integer a = hm.get("Kirthika");	//mapping
		System.out.println("value for key" + " \"Kirthika\" is:- " + a);
			
		}


	}

}
