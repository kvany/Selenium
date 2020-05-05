package training;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class belkshopping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.get("https://www.amazon.com/");  
	    //driver.get("http://www.walmart.com");
	  // driver.findElement(By.linkText("Prime Video")).click();
	   
	   
	   
	}
}