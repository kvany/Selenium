package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/"); 
    driver.manage().window().maximize();
  // WebElement search =
	WebElement find = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	find.sendKeys("womens pants");
	 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	// WebElement item = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div/span/a/div/img"));
	 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[4]/h2/a/span")).click();
	//Actions Act = new Actions (driver);
	 // Act.moveToElement(item).build().perform();
	 
	System.out.println("The Title of the page is :"+driver.getTitle());
  //driver.close();
	}
	}


