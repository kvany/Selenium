package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.discover.com/");
		// js.executeScript("window.scrollBy(0,1000)");
		WebElement onlinebanking = driver
				.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[2]/a/div/span[1]"));
		WebElement Checkingaccount = driver
				.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[2]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(onlinebanking);
		action.moveToElement(Checkingaccount).click().build().perform();
	}

}
