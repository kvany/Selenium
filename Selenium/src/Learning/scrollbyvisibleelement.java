package Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// on the wellsfargo homepage we are scrolling the website to down and ups

public class scrollbyvisibleelement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.wellsfargo.com"); 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/div/div[2]/a"));
	 // js.executeScript("window.scrollBy(0,1000)");//scroll down just by number not to particular element
	 // Thread.sleep(5000);
	 // js.executeScript("window.scrollTo(0,-500)");//scroll up
	    js.executeScript("arguments[0].scrollIntoView();", element); //down upto "getstarted" link. xpath of getstarted link

	}

}
