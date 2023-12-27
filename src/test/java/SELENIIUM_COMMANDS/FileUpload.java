package SELENIIUM_COMMANDS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.findElement(By.xpath("//*[@id=\"sectionGrammarCheck_4VB8kepvT7ciShVSz6rHX\"]/div[2]/form/div/div[4]/button[2]")).click();
		
		Robot robot = new Robot();
			
		StringSelection filePath = new StringSelection("C:\\Program Files\\Google\\sc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
