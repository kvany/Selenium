package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbyvisibleelement  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.wellsfargo.com"); 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	 try {
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/div/div[2]/a"));	
		 js.executeScript("arguments[0].scrollIntoView();", element);
	 }
	 catch(NoSuchElementException e) {
		 System.out.println("test");
	 }
	 
	// js.executeScript("window.scrollBy(0,1000)");
	 //Thread.sleep(5000);
	 //js.executeScript("window.scrollTo(0,-300)");
		 
	 
	 //Lets use Thread.sleep() command in above script to give a specific wait of 5 seconds after 
	 //typing search keyword so that Suggestions will get enough time to load and then click on the last suggestion.
	 
	 // here it has to scroll to the page where we gave xpath that is get started the code is from java
	 //here we commented the code and used  js.executeScript("arguments[0].scrollIntoView();", element);
	 // where the element is Getstarted in the web page for that we gave xpath.
	
	}

}
