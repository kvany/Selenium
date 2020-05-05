package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/* Downloded dependency jar from:
 * https://github.com/SeleniumHQ/htmlunit-driver/releases
 * It will not open the browser, it is faster and it is platform independent.
 */
public class headlessbrowser {

	public static void main(String[] args) {
		
WebDriver driver = new HtmlUnitDriver();
	    driver.get("https://www.google.com/"); 
		System.out.println("The Title of the page is :"+driver.getTitle());
	  driver.close();

	}

}
