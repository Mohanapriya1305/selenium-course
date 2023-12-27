package ExceptionHandling;

public class ClassNotFoundException {

	
		 public static void main(String[] args) { 
		        try{ 
		            Class.forName("Class1");   // Class1 is not defined 
		        } 
		        catch(Exception e){ 
		            System.out.println(e); 
		            System.out.println("Class Not Found..."); 
		        } 
		    } 

	}

