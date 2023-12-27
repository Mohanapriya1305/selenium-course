package ExceptionHandling;

public class StringOutOfBound {

	public static void main(String[] args) {
		try {
			String a ="This is an Exception";
			char c =a.charAt(22);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
