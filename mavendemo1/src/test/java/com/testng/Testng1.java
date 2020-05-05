package com.testng;


	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

	public class Testng1 {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\geckodriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching firefox browser"); 
	      System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
	      driver = new FirefoxDriver();
	      driver.get("http://newtours.demoaut.com/");
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
	}

