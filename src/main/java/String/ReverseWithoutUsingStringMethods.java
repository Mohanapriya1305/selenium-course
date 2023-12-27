package String;

public class ReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		String str = "Automation";
		StringBuilder stb = new StringBuilder();
		stb.append(str);
		stb.reverse();
		System.out.println(stb);

	}

}
