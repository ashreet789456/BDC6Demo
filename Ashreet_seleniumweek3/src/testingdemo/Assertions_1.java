package testingdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_1 {
  @Test
  public void f() {
	  SoftAssert asref=new SoftAssert();
	  System.out.println("First VAlidation");
	  Assert.assertEquals(10,20);
	  System.out.println("Second VAlidation");
	  Assert.assertEquals(10,10);
	 //asref.assertAll();
  }
}
