package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main( String args[]) {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.testproject.io");
		driver.findElement(By.linkText("Start Here")).click();
		}
}
