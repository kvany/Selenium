package com.Seleniumutils;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

public class seleniumutils {
	WebDriver driver;

	// constructor
	public seleniumutils(WebDriver driver)

	{
		this.driver = driver;
	}

	// constructor to take screenshot
	public void to_take_screenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(path));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(driver.getTitle());

	}

}
