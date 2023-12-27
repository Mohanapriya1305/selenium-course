package SELENIIUM_COMMANDS;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
				
		//Finding number of Rows

		List<WebElement> rowsNumber = driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

		//Finding number of Columns

		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table[contains(@id,'customers')]//th"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		//Finding cell value at 4th row and 3rd column

		WebElement cellAddress = driver.findElement(By.xpath("//table[contains(@id,'customers')]/tbody/tr[7]/td[3]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " + value);
		
	}

}
