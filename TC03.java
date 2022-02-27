package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.Configuration;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://formy-project.herokuapp.com");
		driver.manage().window().maximize();


		
		driver.findElement(By.xpath("(//a[@href='/radiobutton'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='option3']")).click();
		
	}
	
	

}