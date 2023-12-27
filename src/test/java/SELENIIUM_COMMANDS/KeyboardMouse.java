package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		
		Actions act= new Actions(driver);
		
		//send a value by using mouse
		act.keyDown(search, Keys.SHIFT)
		.sendKeys("selenium")
		
		//select a value by using mouse
		.keyDown(search, Keys.CONTROL)
		.sendKeys("a")
		.build()
		.perform();
		
		
		
	}

}
