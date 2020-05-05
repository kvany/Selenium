package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// we are just opening the google and closing it.
//  NoSuchElementException
public class loginexceptions {
	
	public static void main(String[] args) throws InterruptedException//for thread sleep 
	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.google.com/"); 
		    System.out.println("The Title of the page is :"+driver.getCurrentUrl());
		    Thread.sleep(2000); // here we throwing interrupted exception throws used to declare the exception
		   try {
		    driver.switchTo().alert().accept();
		    }
		    catch(NoAlertPresentException vany) {
		    vany.printStackTrace();// this will throw exception
		    	  System.out.println("type frame"+vany.getMessage()); 	// tells what went wrong
		    }
		  try {
		    	driver.findElement(By.name("hide"));	
		    }
		    catch (NoSuchElementException e) {
		   System.out.println("handle exception"); 
		   //here we handled the exception and also throwing the exception
		   
		   throw(e); }// it will throw exception still we are handling it at catch
		   finally {
			   System.out.println("hrithi");   
			   driver.close();
		   }	
	}
}
