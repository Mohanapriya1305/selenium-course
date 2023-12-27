package String;

import java.util.Scanner;

public class swaptwonumbers {

	public static void main(String[] args) {
		int A,x,y;
		System.out.println("print x and y value");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping : " + x + y);
		A=x;
		x=y;
		y=A;
		System.out.println("After swapping : " + x + y);
	}

}
