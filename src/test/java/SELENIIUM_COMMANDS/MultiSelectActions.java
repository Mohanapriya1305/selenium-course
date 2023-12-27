package SELENIIUM_COMMANDS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Efficient-Dual-List-Box-Plugin-with-jQuery-Bootstrap/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		//select multiple value from list
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='unselected']/option"));
		act.keyDown(Keys.CONTROL)
		.click(list.get(0))
		.click(list.get(3))
		.click(list.get(4))
		.build()
		.perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-2 center-block']/button[2]")).click();
		driver.switchTo().alert().accept();
		

	}

}
