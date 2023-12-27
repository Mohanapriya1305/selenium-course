package SELENIIUM_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentReport");
		}
	
	@Test
	public static void Test() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google")) {
			
			test.log(LogStatus.PASS,"Test is Passed");
		}
		else {
			
			test.log(LogStatus.FAIL, "Test Failed");
			}
		driver.findElement(By.name("q")).sendKeys("ExtentReports");
		}
	
	
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.close();
	}
	}

