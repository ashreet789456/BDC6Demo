package testingdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;

public class TestClass02 {
  @Test
  public void tmethod3() 
  {
	  System.out.println("method3");
  }
  @Test
  public void tmethod4() 
  {
	  System.out.println("method4");
  }
  
  @BeforeMethod
  public void beforeMethod2() 
  {
	  System.out.println("Beforemethod");
  }

  @AfterSuite
  public void after() 
  {
	  System.out.println("method3");  
	  System.out.println("method4"); 
  }

}
