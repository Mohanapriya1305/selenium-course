package SELENIIUM_COMMANDS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.chromer.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com");
		
		//driver.navigate().refresh();
		
		//driver.get(driver.getCurrentUrl());
		
		driver.navigate().to(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}
