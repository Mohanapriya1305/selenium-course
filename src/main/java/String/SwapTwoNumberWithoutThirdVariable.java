package String;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x,y;
		System.out.println("print the value x and y : ");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping : " + x + y);
		x=x+y;		
		y=x-y;
		x=x-y;
		System.out.println("After swapping : " + x + y);
	}

}
