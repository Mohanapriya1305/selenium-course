package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement From=driver.findElement(By.xpath("//*[@id='credit1']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='loan']"));	
		
		WebElement From1 = driver.findElement(By.xpath("//li[@id='credit2']/a")); 
		WebElement To1 = driver.findElement(By.xpath("//ol[@id='bank']/li[1]"));
		
		WebElement From3 = driver.findElement(By.xpath("//*[@id='fourth']/a")); 
		WebElement To3 = driver.findElement(By.xpath("//*[@id='amt7']/li")); 
		
		WebElement From4 = driver.findElement(By.xpath("//*[@id='fourth']/a")); 
		WebElement To4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		act.dragAndDrop(From1, To1).build().perform();
		act.dragAndDrop(From3, To3).build().perform();
		act.dragAndDrop(From4, To4).build().perform();
	}

}
