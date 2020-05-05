
package com.testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) {
		

				System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			    driver.get("https://www.facebook.com/"); 
			    driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//select by visible text
			  Select month = new Select(driver.findElement(By.id("month")));
			  month.selectByVisibleText("Jun");
			  //select by index
			  Select day = new Select(driver.findElement(By.id("day")));
			  day.selectByIndex(10);
			  //select by value
			  Select year = new Select(driver.findElement(By.id("year")));
			  year.selectByValue("2010");
			 
			 
	}
}
