package SELENIIUM_COMMANDS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingmethod2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> itr = windowhandles.iterator();
		String parentwindow = itr.next();
		System.out.println("parentwindow id : " + parentwindow);
		driver.findElement(By.id("windowhandling1")).click();
		String childwindow = itr.next();
		driver.switchTo().window(childwindow);

	}

}
