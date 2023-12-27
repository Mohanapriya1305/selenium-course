package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		String[] a= {"arya","buva","chitra","chitra","arya","devi","emma","buva","1","2","3"};
		Set<String>duplicate= new HashSet<String>();
		for(String value : a) {
			if(duplicate.add(value)==false) {
				System.out.println(value);
			}
		}

	}

}
