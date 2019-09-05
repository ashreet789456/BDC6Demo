package testingdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class TestClass001 {
  @Test(priority=2)
  public void tmethod1() {
  System.out.println("method1");
  }
  @Test(priority=1)
  public void tmethod2() {
  System.out.println("method2");
  }
  @Test(priority=3)
  public void tmethod5() {
  System.out.println("method5");
  }
  @BeforeMethod
  public void beforeMethod1() 
  {
	  System.out.println("Beforemethod");
  }
  
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("method2");
	  System.out.println("method1");
	  System.out.println("method5");
  }

}
