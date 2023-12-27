package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		WebElement dropdown = driver.findElement(By.id("Birthday_Day"));
		Select dd= new Select(dropdown);
		boolean multiselect=dd.isMultiple(); //multiselect
		System.out.println(multiselect);
		dd.selectByIndex(5);
		
		WebElement dropdown1 = driver.findElement(By.id("Birthday_Month"));
		Select dd1= new Select(dropdown1);
		dd1.selectByValue("April");
		
		WebElement dropdown2 = driver.findElement(By.id("Birthday_Year"));
		Select dd2= new Select(dropdown2);
		dd2.selectByVisibleText("1995");

	}

}
