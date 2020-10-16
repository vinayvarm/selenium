package com.bank.examples;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.Alert;



public class TC_BANK01_AddLoanDetails {

	/* 
	 * resource name: vinay
	 * date:23 jan
	 * projectname: bank
	 * module:admin
	 * +++++++++++++++++++++++++++++++++++
	 * test case steps 
	 * 
	 * enter url
	 * login into application
	 * click on build 2
	 * click admin login
	 * login with admin cred
	 * click on addloandetails
	 * give all the req fields
	 * click on save button
	 * 
	 * */
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		driver.navigate().to("http://livetesting.in");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("batch01");
		driver.findElement(By.name("password")).sendKeys("batch01");
		driver.findElement(By.name("sub")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnlinktwo")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id=\"myNavbar\"]//li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"myNavbar\"]//li[4]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,350)");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.name("lname")).sendKeys("EduLoan");
		 Thread.sleep(1000);
		 driver.findElement(By.name("ntpr")).sendKeys("1 year");
		 Thread.sleep(1000);
		 driver.findElement(By.name("emi")).sendKeys("500");
		 Thread.sleep(1000);
		 driver.findElement(By.name("rtin")).sendKeys("ten");
		 Thread.sleep(1000);
		 driver.findElement(By.name("max")).click();
		 Thread.sleep(1000);
		 
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.name("max")).sendKeys("16000");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		 
	}

}
