package com.testcases;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	public class OrangeHRDataprovider {
	
		WebDriver driver;
			@Test(dataProvider = "Orangehrlogin") 
	public void OrangeHRM(String username,String password) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys((username));
	driver.findElement(By.id("txtPassword")).sendKeys((password));
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("user is able to login succesfully");
	}

	@AfterMethod
	public void closeapp() throws InterruptedException{
	Thread.sleep(3000);
		driver.quit();
	}

	@DataProvider(name="Orangehrlogin")
	public Object[][] passData() throws InterruptedException{
		
		
	Object[][] data = new Object[1][2];
		 //username
		 data[0][0]="Admin";
		 data[0][1]="admin123";
		// Thread.sleep(1000);
		 //data[1][0]="joshi";
		 //data[1][1]="demo123";
		 
		 //data[2][0]="sathya";
		 //data[2][1]="demo1234";
		 
		 return data;
	}
		 
		
	}




