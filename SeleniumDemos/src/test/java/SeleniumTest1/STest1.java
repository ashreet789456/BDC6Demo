package SeleniumTest1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class STest1 {
 WebDriver driver1;
 //WebDriver driver2;
 //WebDriver driver3;
	@BeforeTest
	public void ConfigureBrowser() {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\a.ningayya.salimath\\Selenium week 3\\SeleniumDrivers\\chromedriver.exe");
	driver1 = new ChromeDriver();
	//System.setProperty("webdriver.ie.driver",
			//"C:\\Users\\a.ningayya.salimath\\Selenium week 3\\SeleniumDrivers\\IEDriverServer.exe");
	//driver2 = new InternetExplorerDriver();
	//System.setProperty("webdriver.gecko.driver",
			//"C:\\Users\\a.ningayya.salimath\\Selenium week 3\\SeleniumDrivers\\geckodriver.exe");
	//driver3 = new FirefoxDriver();
	}
	@Test 
	public void openApplication() {
		driver1.get("http://10.232.237.143:443/TestMeApp");
		//driver2.get("http://10.232.237.143:443/TestMeApp");
		//driver3.get("http://10.232.237.143:443/TestMeApp");
	}
	@AfterTest
	public void closeApp() {
		driver1.close();
		//driver2.close();
		//driver3.close();
	}
	
	
}
