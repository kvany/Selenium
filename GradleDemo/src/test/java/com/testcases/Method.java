package com.testcases;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Method {

		@Test(dataProvider="testdata")
		 public void DemoProject(String username, String password) throws InterruptedException
		 {
   	
   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	

		driver.get("http://newtours.demoaut.com/");
		  
		 driver.findElement(By.name("userName")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.name("login")).click();
		  
		 Thread.sleep(5000);
		  
		 Assert.assertTrue(driver.getTitle().matches("Find a Flight: Mercury Tours:"), "Invalid credentials");
		 System.out.println("Login successful");
		 }
		  
		 @AfterMethod
		 void ProgramTermination()
		 {
		 driver.quit();
		 }
		 
		@DataProvider(name="testdata")
		 public Object[][] TestDataFeed()
		 {
		  
		// ReadExcelFile config = new ReadExcelFile("C:UsersVardhanworkspaceSeleniumLoginCredentials.xlsx");
		 FileInputStream fil=new FileInputStream(new File("C:\\Users\\KRISHNA PC\\Desktop\\AghamaTestdata\\FacebookExcelSheet_testng.xlsx"));
		  
		 int rows = fil.getR
				 getRowCount(0);
		  
		 Object[][] credentials = new Object[rows][2];
		 
		for(int i=0;i<rows;i++)
		 {
		 credentials[i][0] = config.getData(0, i, 0);
		 credentials[i][1] = config.getData(0, i, 1);
		 }
		  
		 return credentials;
		
   }


	}

}
