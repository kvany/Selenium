package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kvani253@gmail.com");
	   Actions action = new Actions(driver);
	   action.sendKeys(Keys.TAB).perform();
	   action.sendKeys("abc").perform();
	 // action.sendKeys(Keys.ENTER).perform();
	  
	  action.sendKeys(Keys.RETURN).perform(); 
	  //Both enter and return does the same 
			   
	}

}
