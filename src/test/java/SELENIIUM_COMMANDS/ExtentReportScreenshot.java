package SELENIIUM_COMMANDS;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportScreenshot {

	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeMethod
	public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir")+ "\\ExtentreportScreenshot.html");
		test = report.startTest("ExtentReportScreenshot");
	}
	
	@Test
	public void screenshotTest() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("google website")) {
			test.log(LogStatus.PASS,"Test is passed");
		}
		else {
			test.log(LogStatus.FAIL, "Test is Failed");
		}
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(source, new File( "E:\\eclipsework\\2023_SELENIUM_SYNTAX\\Screenshot\\ExtentReportScreenshot.png"));
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

	
	@AfterMethod
	public void endTest() {
		report.endTest(test);
		report.close();
	}

	
}
