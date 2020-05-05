package Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// In discover.com where clicking on all products from there to credit cards

public class Mousehandlingactions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://www.discover.com/"); 
	    // js.executeScript("window.scrollBy(0,1000)");
	    WebElement Allproducts = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[4]/div[2]/div/a/span"));
	    WebElement Creditcards = driver.findElement(By.xpath("//*[@id=\"expand_menu_label\"]"));
	    Allproducts.click();
	    Creditcards.click();
        // Actions action=new Actions(driver);
        //Thread.sleep(5000);
        //action.moveToElement(Creditcards).click().build().perform();
      
	}

}
