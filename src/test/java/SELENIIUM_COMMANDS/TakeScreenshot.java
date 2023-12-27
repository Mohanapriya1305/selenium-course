package SELENIIUM_COMMANDS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();		
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("takescreenshot");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     
		FileUtils.copyFile(scrFile, new File("E:\\eclipsework\\2023_SELENIUM_SYNTAX\\Screenshot\\screenshot7.png"));

		/*TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  try {
		   FileUtils.copyFile(source, new File("E:\\eclipsework\\2023_SELENIUM_SYNTAX\\Screenshot\\screenshot1.png"));
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.getMessage();
		  }
		 }*/
}
}

