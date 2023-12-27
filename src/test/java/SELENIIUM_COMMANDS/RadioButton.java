package SELENIIUM_COMMANDS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			driver.manage().window().maximize();
			driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");	
			WebElement list= driver.findElement(By.xpath("//input[@value='Male']"));
		    list.click();
		          
		         	


	}

}
