package com.testcases;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Forbes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.forbes.com/"); 
	    String ActualTitle = driver.getTitle();
	    driver.manage().window().maximize();
	    String expectedTitle = "https://www.forbes.com/";
	    String actualTitle = driver.getTitle();
	  // Assert.assertEquals("https://www.forbes.com/", driver.getCurrentUrl());
	  if(ActualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		System.out.println("The Title of the page is :"+driver.getCurrentUrl());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file, new File("./Screenshot/forbes1.png")); 
	      
	  
	       try{
	    	   driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[4]/a"));
	    	   //Since, no exception, so element is present
	    	   System.out.println("Element present");
	    	  }
	    	  catch(NoSuchElementException e){
	    	   //Element is not present
	    	   System.out.println("Element not present");
	    	   driver.close(); 
	    	  }
	}

}
