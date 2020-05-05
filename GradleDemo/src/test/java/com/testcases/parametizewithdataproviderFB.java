package com.testcases;

import org.openqa.selenium.By;

//Here we are sending data to login to FB & checking whether it will open the FB & enter data or not here we have given 3 i/p s need to get 3 times 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parametizewithdataproviderFB {
	WebDriver driver;
		@Test(dataProvider = "facebooklogin") 
public void loginTofacebook(String username,String password) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
 driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys((username));
driver.findElement(By.id("pass")).sendKeys((password));
//driver.findElement(By.xpath("//input[@id='wp_submit']")).click();
Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
System.out.println(driver.getCurrentUrl());
System.out.println("user is able to login succesfully");
}

@AfterMethod
public void closeapp() throws InterruptedException{
Thread.sleep(3000);
	driver.quit();
}

@DataProvider(name="facebooklogin")
public Object[][] passData() throws InterruptedException{
	
	
Object[][] data = new Object[3][2];
	 //username
	 data[0][0]="vany";
	 data[0][1]="demo1";
	 Thread.sleep(1000);
	 data[1][0]="joshi";
	 data[1][1]="demo123";
	 
	 data[2][0]="sathya";
	 data[2][1]="demo1234";
	 
	 return data;
}
	 
	
}

