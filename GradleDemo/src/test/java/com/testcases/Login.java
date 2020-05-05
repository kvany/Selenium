package com.testcases;

import java.util.concurrent.TimeUnit;//run as java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
	    driver.get("https://www.google.com/");
	
	    System.out.println("The Title of the page is :"+driver.getTitle());
	    
	    

	}

}
