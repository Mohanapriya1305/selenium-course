package SELENIIUM_COMMANDS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.get("https://www.google.co.in"); 
		  driver.findElement(By.name("q")).sendKeys("selenium"); // Replace with the actual name or other locator

		  Thread.sleep(2000);

		  List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		
		  for(int i=0;i<list.size();i++) {
			  System.out.println(list.get(i).getText());
			  if(list.get(i).getText().equals("selenium automation testing")) {
				  list.get(i).click();
			  }
		  }

	}  
	    }
	      

	       

	


