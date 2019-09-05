package SeleniumTest1;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreports {
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void startReport() 
	{
		String path=System.getProperty("user.dir") + "/extent-reports/report1.html";
		reporter = new ExtentHtmlReporter(path);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		driver=drivers.configureDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		extent.setSystemInfo("Hostname", "Next Gen Automated Testing");
		extent.setSystemInfo("Environment", "Selenium automated test");
		extent.setSystemInfo("User name", "Ashreet");
		reporter.config().setDocumentTitle("title appears here");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("TestMe End to End Automation report");
	}
	@Test(priority=1)
	public void testRegistration() throws InterruptedException 
	{
		  logger=extent.createTest("testRegistration","Customer registers the details in TestMe");  
		  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		  driver.findElement(By.id("userName")).sendKeys("ashreet810");
		  driver.findElement(By.id("firstName")).sendKeys("Ashreet");
		  driver.findElement(By.id("lastName")).sendKeys("Salimath");
		  driver.findElement(By.id("password")).sendKeys("ash456");
		  driver.findElement(By.id("pass_confirmation")).sendKeys("ash456");
		  
		  WebElement gen=driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		  gen.click();
		  driver.findElement(By.id("emailAddress")).sendKeys("ashreet21@gmail.com");
		  driver.findElement(By.id("mobileNumber")).sendKeys("1234657892");
		  //driver.findElement(By.name("dob")).sendKeys("05/05/1998");
		  driver.findElement(By.className("ui-datepicker-trigger")).click();
		  Select mon=new Select(driver.findElement(By.className("ui-datepicker-month")));
		  mon.selectByVisibleText("Feb");
		  Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		  year.selectByValue("1997");
		  driver.findElement(By.linkText("11")).click();
		  driver.findElement(By.id("address")).sendKeys("150 lane street");
		  driver.findElement(By.id("securityQuestion")).click();
		  Thread.sleep(2000);
		  Select sq=new Select(driver.findElement(By.id("securityQuestion")));
		  Random rand = new Random();
		  int value = rand.nextInt(3);
		  sq.selectByIndex(value);
		  Thread.sleep(2000);
		  driver.findElement(By.name("answer")).sendKeys("Bolt");
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
		  //test code
		  String msg = driver.findElement(By.xpath("/html/body/header/div/b/a")).getText();
		  Assert.assertEquals(msg,"Home");
	}
	@Test(priority=2)
	public void testLogin() 
	{
		logger=extent.createTest("testLogin","Registered user login to TestMe using credentials");
		driver.findElement(By.id("userName")).sendKeys("ashreet810");
		driver.findElement(By.id("password")).sendKeys("ash456");
		driver.findElement(By.name("Login")).click();		
		String msg = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul")).getText();
		Assert.assertEquals(msg,"Hi, ashreet810 SignOut");
	}
	@Test(priority=3)
	public void testCart() throws InterruptedException 
	{
		 logger=extent.createTest("testCart","User adds products to the cart for purchase");  
		 WebElement search1=driver.findElement(By.id("myInput"));
		  Actions act1=new Actions(driver);
		  act1.sendKeys(search1,"head").perform();
		  Thread.sleep(2000);
		  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		  Thread.sleep(2000);		
		  String msg = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		  Assert.assertEquals(msg,"Review");
	}
	@Test(priority=4)
	public void testPayment() 
	{
		logger=extent.createTest("testPayment","user pays for the selected products");
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		// driver.findElement(By.xpath("//input[@value='Andhra Bank']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		 // driver.findElement(By.xpath("//div[@class='radio'][1]"));
		  //driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]")).click();
		  //radio1.click();
		  //Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='btn']")).click();
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();		
		String msg = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).getText();
	    Assert.assertEquals(msg,"SignUp");
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.SUCCESS) 
		{
			logger.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Test passed", ExtentColor.GREEN));
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Test Failed", ExtentColor.RED));
			TakesScreenshot capture=(TakesScreenshot)driver;
			File source=capture.getScreenshotAs(OutputType.FILE);
			String imgPath=System.getProperty("user.dir")+"/extent-reports/snapshots/"+result.getName() +".png";
			System.out.println(imgPath);
			FileUtils.copyFile(source,new File(imgPath));
			logger.addScreenCaptureFromPath(imgPath ,result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"Test skipped", ExtentColor.ORANGE));
		}
	}     
	@AfterTest
	public void endReport() 
	{
		extent.flush();    //commits the generated report
	}
}
//Review & Payment
//*[@id="menu3"]/li[1]/a/span
//*[@id="menu3"]/li[1]/a/span