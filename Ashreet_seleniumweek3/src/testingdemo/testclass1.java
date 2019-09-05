package testingdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass1 {
	
	@BeforeMethod
	public void a() {
		System.out.println("before");
	}
	@AfterMethod
	public void b() {
		System.out.println("after");
	}
	@Test 
	public void display() {
		System.out.println("Hello");
	}
}
