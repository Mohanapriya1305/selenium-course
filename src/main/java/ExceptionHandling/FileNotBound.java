package ExceptionHandling;
import java.io.File;
import java.io.FileReader;
public class FileNotBound {

	public static void main(String[] args) {
		try {
			File file = new File("E://test.txt");
			FileReader fr= new FileReader(file);
			System.out.println(fr);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
