package SELENIUM_PRACTICE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_all_options_present_listbox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://total-qa.com/selenium-webdriver/practise-website/");
		
		WebElement l = driver.findElement(By.id("COUNTRY")); 
		Select select = new Select(l);
		List<WebElement> lb = select.getOptions(); //all options
		System.out.println("List box all options : " + lb.size());
		List<WebElement> allOptions = select.getOptions(); 
		int count=allOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		select.selectByIndex(i);
		}
		select.deselectAll();
		}
}