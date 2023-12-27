package String;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeNumber {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		List<WebElement> em=driver.findElements(By.xpath("//td")); 
		for(WebElement box: em) {
			System.out.println(box.getText());
		}
	}
	}
