package ExceptionHandling;

public class NullPointerException {
	public static void main(String[] args) {
		
	try {
		String a = null;
		a.charAt(0);
		System.out.println(a);	
		}
	
	catch(Exception e){
		System.out.println(e);
	}
}
}
