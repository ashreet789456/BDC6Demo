package SeleniumTest1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationCS{
 WebDriver driver;
 @BeforeTest
 public void configureBrowser() {
     driver = drivers.configureDriver("chrome");
     driver.manage().window().maximize();
     driver.get("http://10.232.237.143:443/TestMeApp");
     }
  @Test(dataProvider="credentials")
  public void Regis(String ashreet21,String Ashreet,String S,String pass,String passcon,String d,String mid,String pno,String mon1,String year1,String date1,String addr,String seqn,String pla) throws IOException {
   driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ashreet21);
   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Ashreet);
   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(S);
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
   driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(passcon);
   driver.findElement(By.xpath("//label[@class='form-control input-lg']")).sendKeys(d);
   if(d.equals("Male"))
   {
    driver.findElement(By.xpath("//input[@value='Male']")).click();
   }
   else
   {
    driver.findElement(By.xpath("//input[@value='Female']")).click();
   }   
   driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(mid);
   driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(pno);
   driver.findElement(By.className("ui-datepicker-trigger")).click();
    Select mon=new Select(driver.findElement(By.className("ui-datepicker-month")));
    mon.selectByVisibleText(mon1);
    Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
    year.selectByValue(year1);
    driver.findElement(By.linkText(date1)).click();
    
   driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(addr);
   Select sqn=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
   sqn.selectByVisibleText(seqn);
   driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(pla);
   driver.findElement(By.xpath("//input[@value='Register']")).click();
  }
  
    @DataProvider
  public Object[][] credentials() throws IOException{
   return ExcelRegistration.readData();
  }
    @AfterTest
    public void closeApp() 
    {
    	driver.close();
    }
}

