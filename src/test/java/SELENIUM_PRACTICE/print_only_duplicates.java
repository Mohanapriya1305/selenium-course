package SELENIUM_PRACTICE;

import java.util.HashSet;
import java.util.Set;


public class print_only_duplicates {

	public static void main(String[] args) {
		String array[] = {"Testing", "java", "Manual","selenium", "Manual" ,"Testing", "java", "Automation", "python"};
		Set<String> duplicate =new HashSet<>();
		for(String duplicates : array) {
			 if(duplicate.add(duplicates)== false) {
				 System.out.println(duplicates);
				
			}
		}
		
		
    }
}

	