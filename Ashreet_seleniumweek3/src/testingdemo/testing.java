package testingdemo;

import org.testng.annotations.Test;

public class testing {
  @Test(priority=3)
  public void testinggoogle() {
	  System.out.println("testingGoogle");
  }
  @Test(priority=2,enabled=false)
  public void testingfb() {
	  System.out.println("testingFacebook");
  }
  @Test(priority=1)
  public void testingtwitter() {
	  System.out.println("testingTwitter");
  }
}
  