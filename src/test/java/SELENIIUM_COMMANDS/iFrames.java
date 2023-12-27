package SELENIIUM_COMMANDS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Efficient-Dual-List-Box-Plugin-with-jQuery-Bootstrap/");
		Thread.sleep(2000);
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(2000);
		  //Find total no.of iFrames in the List<> 
		List<WebElement> iframelist =  driver.findElements(By.tagName("iframe"));
		int totalframes = iframelist.size();
		 System.out.println( "total frames : " + totalframes);
		 
					//Go to the 1st frame and back to main frame
			  WebElement frame = driver.findElement(By.name("iframe_a"));
			  driver.switchTo().frame(frame);
			  driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
			  Thread.sleep(2000);
			  driver.switchTo().parentFrame(); //back to parent
			  		//Go the 2nd frame
			  WebElement frame1 = driver.findElement(By.name("iframe_b"));
			  System.out.println( "List of frames : " );
			  for(WebElement iframe : iframelist) {    
				  System.out.println(iframe.getAttribute("name"));  //get all attribute names in the no.of iFrame list
				  if(iframe.getAttribute("name").equals("iframe_b")) //check the attribute name if it's equal to "iframe_b"
				  {
					  driver.switchTo().frame(frame1);
					  driver.findElement(By.id("searchInput")).sendKeys("selenium iframe testing");
					  driver.findElement(By.xpath("//button[@type='submit']")).click();
					  Thread.sleep(2000);
					  driver.switchTo().defaultContent(); //back to parent 
					  
				  }
				  
			  }
		 
	}
	
}
