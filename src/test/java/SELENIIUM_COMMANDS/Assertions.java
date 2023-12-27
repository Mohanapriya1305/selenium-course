package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void verifyLogo()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in");
	//To verify if an object is visible 
	WebElement IrctcLogo = driver.findElement(By.xpath("//*[contains(@alt,\"Indian railway logo\")]"));
	System.out.println(driver.getTitle());
	Assert.assertEquals(true, IrctcLogo.isDisplayed());
	System.out.println("IRCTC logo is displayed – Assert passed");
	
	//To verify if text or value is present
	String ExpectedText="IRCTC Next Generation eTicketing System";
	Assert.assertEquals(ExpectedText,IrctcLogo.getText());
	System.out.println("IRCTC Text is displayed – Assert passed");
	}
}
