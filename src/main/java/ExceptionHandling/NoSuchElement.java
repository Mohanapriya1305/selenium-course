package ExceptionHandling;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchElement {

	public static void main(String[] args) {
		Set set= new HashSet();
		Hashtable table= new Hashtable();
		set.iterator().next();
		table.elements().nextElement();
		
	}

}
