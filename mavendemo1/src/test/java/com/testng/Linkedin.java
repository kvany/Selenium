package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Linkedin {
	WebDriver driver = null;

	@BeforeMethod()
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/uas/login");
		Thread.sleep(5000);
	}

	@Test
	public void linkedinsearch() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("varisetty@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Weddington@1");
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button")).click();
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/linkedin.png"));
	}

	@AfterMethod
	public void closebrowser() {

		driver.close();
	}
}
