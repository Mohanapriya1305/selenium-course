package SELENIIUM_COMMANDS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		List<WebElement> em=driver.findElements(By.xpath("//input[@name='Hobby']")); 
		for(WebElement box: em) {
		if(!box.isSelected()) {
		box.click();
		
		}
		
		}	
		Thread.sleep(2000);
		for(WebElement box: em) {
		if(box.isSelected()) {
		box.click();
		}
		}
		
	}

}


