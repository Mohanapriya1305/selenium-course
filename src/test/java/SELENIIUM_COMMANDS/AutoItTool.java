package SELENIIUM_COMMANDS;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItTool {
	
	
	 public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver= new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/basic_auth");
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("E:\\Authen.exe");
	 }

}
