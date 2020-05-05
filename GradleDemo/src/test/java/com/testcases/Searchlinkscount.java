package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchlinkscount {

	//public static void main(String[] args) {
		
		
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
    String url = "https://google.com";
    driver.get(url);
   
    Thread.sleep(2000);
    WebElement find = driver.findElement(By.name("q"));
    find.sendKeys("testing");
    Thread.sleep(2000);
    WebElement click = driver.findElement(By.name("btnK"));
    click.click();
     Thread.sleep(2000);
 List<WebElement> links = driver.findElements(By.xpath("//a")); 
 //Identify the number of Link on webpage and assign into Webelement List 
 Object linkCount = links.size();     // Count the total Link list on Web Page
//  int linkCount = links.getSize();     // Count the total Link list on Web Page
 System.out.println("Total Number of link count on webpage = "  +linkCount);    //Print the total count of links on webpage
	          
	        //  for(int i=0; i<links.size(); i++) {
	        //	  System.out.println("total links :"+links.get(i).getAttribute("value"));
	         // }
	          
	          WebElement allElements = driver.findElement(By.xpath("//*"));      //Identify all the elements on web page
	          
	          Dimension elementsCount = allElements.getSize();     //Count the total all element on web page
	          
	          System.out.println("Total Number of All Element on webpage = "  +elementsCount);         //Print the total count of all element on webpage
	                
	    }
	
}




