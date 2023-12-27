package SELENIUM_PRACTICE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class print_all_options_except_duplicate {

	public static void main(String[] args) {
		List<String> a=Arrays.asList("arya","buva","chitra","chitra","arya","devi","emma","buva","1","2","3");
		Set<String>duplicate= new HashSet<String>();
		for(String value : a) {
			if(duplicate.add(value)) {
				System.out.println(value);
			}
		}


	}

}
