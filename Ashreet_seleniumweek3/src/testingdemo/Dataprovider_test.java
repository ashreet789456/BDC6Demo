package testingdemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider_test {
  @Test(dataProvider = "loginCredentials")
  public void testlogin(String username,String pwd) {
	  System.out.println("Credentials: "+username+","+pwd);
  }

  @DataProvider
  public Object[][] loginCredentials(){
    Object[][] data= {
      new Object[] {"Lalitha", "Password123" },
      new Object[] { "Admin", "Password456" },
    };
    return data;
  }
}
