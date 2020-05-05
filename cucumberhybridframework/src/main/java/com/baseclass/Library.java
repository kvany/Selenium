package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {
	protected WebDriver driver;
	public static Properties prop;
	public void launchApplication() throws IOException {
		FileInputStream fileIS = new FileInputStream("C:\\Users\\KRISHNA PC\\eclipse-workspace\\cucumberhybridframework\\src\\test\\resources\\Configproperties\\config.properties");
    	prop = new Properties();
    	prop.load(fileIS); // loads config file from the folder
    	//logger.info("property file is loaded");
    	String browser = prop.getProperty("browser");
    	//to launch chrome brower
		
		try {
			if(browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\eclipse-workspace\\cucumberhybridframework\\src\\test\\resources\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get(prop.getProperty("url"));
			
		} catch (WebDriverException e) {
			System.out.println("browser could not be launched");
		}	
	}
	public void quit() {
		driver.close();
	}
	
	public void screenshot(String path) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(path));
	
	}	
	public void dropdown(String locator1) {
		Select dropdown= new Select(driver.findElement(By.xpath(locator1)));
		
	}
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		}
	

}


