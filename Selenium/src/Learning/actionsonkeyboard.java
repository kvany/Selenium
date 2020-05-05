package Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// logging into facebook through actions class
public class actionsonkeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("kvany");
	    Actions Act = new Actions(driver);
	    Act.sendKeys(Keys.TAB).perform();
	    Act.sendKeys("abc").perform();
	    Act.sendKeys(Keys.ENTER).perform();
	 // Act.sendKeys(Keys.Return).perform();  same function as enter
	
	}
}
