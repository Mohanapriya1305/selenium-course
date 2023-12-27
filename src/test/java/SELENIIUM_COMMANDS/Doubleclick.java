package SELENIIUM_COMMANDS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//Doubleclick the button
		Actions act = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')] "));
		act.doubleClick(dc).build().perform();
		Thread.sleep(2000);
		
		//Get the displayed text from pop-up window using Alert
		Alert alt = driver.switchTo().alert();
		System.out.println("Get the value :" + alt.getText());
		alt.accept();
		
		
	}

}
