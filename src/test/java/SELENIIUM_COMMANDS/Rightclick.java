package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//Actions class
		Actions act=new Actions(driver);
		
		//Rightclick >> contextclick
		WebElement rightclick =	driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		act.contextClick(rightclick).build().perform();
		Thread.sleep(2000);
		
		//click the displayed menu from rightclick 
		WebElement copy = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]"));
		copy.click();
		Thread.sleep(2000);
		
		//Accept the alert - ok button
		driver.switchTo().alert().accept();
	}

}
