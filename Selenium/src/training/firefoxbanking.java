package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class firefoxbanking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.chase.com/"); 
				  //  WebElement openaccount = driver.findElement(By.xpath("/html/body/div/div[4]/header/div[4]/div[1]/div/div/a"));
	    WebElement openaccount = driver.findElement(By.className("header__section--dropdown__title"));
				 WebElement Creditcards =driver.findElement(By.xpath("/html/body/div/div[4]/header/div[4]/div[1]/div/div/div/div/div[1]/div/a/p[1]"));	
			     Actions action=new Actions(driver);
			     action.moveToElement(openaccount);
			    action.moveToElement(Creditcards).click().build().perform();

	}

}