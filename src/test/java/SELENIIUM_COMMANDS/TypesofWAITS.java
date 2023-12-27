package SELENIIUM_COMMANDS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesofWAITS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://phptravels.org/login");
		driver.findElement(By.id("inputEmail")).sendKeys("priyashanmugam46@gmail.com");
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("arunpriya");
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    WebElement w =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
		w.click();
		
		//fluent wait
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				

	}

}
