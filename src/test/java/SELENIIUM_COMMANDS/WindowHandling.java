package SELENIIUM_COMMANDS;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		//getWindowHandle method for current window
		String Parentwindow= driver.getWindowHandle();
		System.out.println("parentwindow id : " + Parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.id("windowhandling1")).click();   //finding locators
		
		//getWindowHandles method for child windows
		Set<String> Allwindow = driver.getWindowHandles();
		for(String window : Allwindow) {
			System.out.println("Allwindows id : " + window);
		}
		
		//Iterate the window
		Iterator<String> itr = Allwindow.iterator();
		while(itr.hasNext()) {
		String childwindow=	itr.next();
		if(!Parentwindow.equalsIgnoreCase(childwindow)) {
			driver.switchTo().window(childwindow);
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("searchInput")).sendKeys("selenium tutorial");
			Thread.sleep(2000);
		}
		}
		
			driver.switchTo().window(Parentwindow);
			driver.close();		
		
	}
	
	

}
