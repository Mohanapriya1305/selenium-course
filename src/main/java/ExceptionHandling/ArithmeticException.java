package ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		try {	
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("print the value" + c);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
