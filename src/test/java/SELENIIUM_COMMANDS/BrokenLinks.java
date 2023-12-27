package SELENIIUM_COMMANDS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main( String args[]) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.get("https://www.google.co.in"); 
		
		
	 String url = ""; 
	 HttpURLConnection con = null; 
	 int responseCode = 200;

	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 Iterator<WebElement> it = links.iterator(); 
	 while (it.hasNext()) 
	 { 
	 url = it.next().getAttribute("href"); 
	 try { 
		 con = (HttpURLConnection) (new URL(url).openConnection()); 
		 con.setRequestMethod("HEAD"); 
		 con.connect(); 
		 responseCode = con.getResponseCode(); 
		 if (responseCode >= 400) 
		 { 
	System.out.println(url + " is a broken link"); 
	} 
		 else { 
			 System.out.println(url + " is a valid link"); 
		 } 
	 } 
	 catch (MalformedURLException e) 
	 { 
		 e.printStackTrace(); 
		 } 
	 catch (IOException e)
	 { 
		 e.printStackTrace();
		 } 
	 }
 driver.quit();
 } 
	}
	


