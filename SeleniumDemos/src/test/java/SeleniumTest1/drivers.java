package SeleniumTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {

	public static WebDriver configureDriver(String browsername) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\a.ningayya.salimath\\Selenium week 3\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		}
		
		else if(browsername.equals("explorer")) {
		System.setProperty("webdriver.ie.driver",
		"C:\\Users\\a.ningayya.salimath\\Selenium week 3\\SeleniumDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		return driver;

	}

}
