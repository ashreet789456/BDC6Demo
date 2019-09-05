package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class moveactions {
	 WebDriver driver;
	@BeforeTest
	  	public void configureBrowser() 
	  {
		  driver=drivers.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	  }
	@Test
  public void testMethod() throws InterruptedException 
	{
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.
	    //findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(driver.
	    //findElement(By.xpath("//span[contains(text(),'All\n" + 
	    	//	"										Categories')]"))).moveToElement(driver.
	    //findElement(By.xpath("//span[contains(text(),'Chennai')]"))).
		//click().build().perform();
		WebElement s=driver.findElement(By.id("myInput"));
		s.sendKeys("h");
		s.sendKeys("e");
		Thread.sleep(3000);
		s.sendKeys("a"); 
		s.sendKeys("d");
		Actions act=new Actions(driver);
		act.keyDown(s,Keys.SHIFT).perform();
		act.moveToElement(driver.
				findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		
	}
	
	@AfterTest
		public void closeApp()  
	  	{
			driver.close();
		}
}
