package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tcng1 {
	
	@Test(priority=3)  
	public void TC1() {
		System.out.println("TC1 Exected");
	}

	@Test(priority=1)      //Priority is one so execute first
	public void TC2() {
		System.out.println("TC2 Exected");
	}
	
	@Test(enabled = false)		//this will not execute method
	public void TC3() {
		System.out.println("TC3 Exected");
	}
	
	@Test(invocationCount=5)      //Priority is one so execute first
	public void TC4() {
		System.out.println("TC4 Exected");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Application Login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Application LogOut");
		System.out.println();
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is Open");
		System.out.println();
	}
	
	@AfterClass
	public void CLoseBrowser() {
		System.out.println("Browser is Closed");
	}
}
