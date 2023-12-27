package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("simpleAlert"));
		
		//Scroll down by Visibility of Element
		js.executeScript("arguments[0].scrollIntoView",ele); 
		
		//Scroll up or down by pixel
		js.executeScript("window.scrollBy(1000,4000)");
		
		//or 
		js.executeScript("window.scrollBy(1000,0)");
		
		//scroll height		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
	}

}
