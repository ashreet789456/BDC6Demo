package SeleniumTest1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpath 
{
	  WebDriver driver;
	  @BeforeTest
	  	public void configureBrowser() 
	  {
		  driver=drivers.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  @Test
	  	public void f() 
	  {
		  
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.presenceOfElementLocated(
				  By.xpath("//input[@id='userName']")));
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
		  wait.until(ExpectedConditions.presenceOfElementLocated(
				  By.xpath("//input[@id='password']")));
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password456");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Assert.assertEquals(driver.getTitle(),"Admin Home");
		  //driver.findElement(By.xpath("//input[@id='SignOut']")).click();
		  String msg1=driver.findElement(By.xpath("/html/body/header/div/b")).getText();
		  Assert.assertEquals(msg1,"Hi, Admin    SignOut");
		  //driver.findElement(By.xpath("//div[@class='btn-group'][2]")).click();
		  //driver.findElement(By.xpath("//input[@id='catgName']")).sendKeys("Holidays");
		  //driver.findElement(By.xpath("//input[@id='catgDesc']")).sendKeys("Bags");
		  //driver.findElement(By.xpath("//input[@value='Add']")).click();		   	  
		  driver.findElement(By.xpath("//div[@class='btn-group'][4]")).click();
		  Select catgDrop=new Select(driver.findElement(By.id("categorydropid")));
		  catgDrop.selectByVisibleText("Electronics");
		  WebElement subCat=driver.findElement(By.id("subcategorydropid"));
		  Select subCatgDrop=new Select(subCat);
		  subCatgDrop.selectByIndex(2);
		  driver.findElement(By.xpath("//input[@value='View Products']")).click();
		  
	  }
	 
	  @AfterTest
		public void closeApp()  
	  	{
			driver.close();
		}
}
