package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

// 1st we need to determine whether the screen we are working on is a Frame for that we can click on the frame and see if there is an iframe in that.
//that means it a frame than we need to switch to frame 1st
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class framesdraganddrop{

	public static void main(String[] args) throws InterruptedException {
	
	
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();
		
		// the above program will drag one frame and drop into another frame.
		
//FRAN	    WebDriver driver=new ChromeDriver();
//FRAN		driver.manage().window().maximize();
//FRAN		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//FRAN		driver.get("https://jqueryui.com/draggable/");
//FRAN		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//FRAN	    System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
//FRAN	    driver.switchTo().defaultContent();
//FRAN      driver.findElement(By.linkText("Droppable")).click();
//FRAN	    Thread.sleep(3000);
		
	// Whether Draggable frame is identified or not and clicking on droppable and coming back
	    driver.close();

	}
}
