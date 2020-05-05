package training;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Actions action = new Actions(driver);
		action.sendKeys("kvani253@gmail.com").perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("abcd").perform();
		action.sendKeys(Keys.ENTER).perform();
		// driver.findElement(By.id("email")).sendKeys("kvani253@gmail.com");
		// driver.findElement(By.id("pass")).sendKeys("abcd");
		// driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		// driver.close();
	}

}
