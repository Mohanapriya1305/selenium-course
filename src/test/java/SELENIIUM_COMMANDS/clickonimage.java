package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickonimage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver","default");
		//System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		//System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']")).click();
//		
//		if(driver.getTitle().equals("Facebook � log in or sign up")) {
//			System.out.println("Facebook home page");
//		}
//		else
//		{
//			System.out.println("wrong home page");
//		}
		driver.get("https://www.changiairport.com/");
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='nvg-logo nvg-logo--mb']/img[1]"));
		if(driver.getTitle().equals("Welcome To Singapore Changi Airport"))
		{
			System.out.println("Singapore Changi Airport Home page");
		}
		else
		{
			System.out.println("Wrong page");
		}
	}

}
