package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebookcreate {

	public static void main(String[] args) {
		// Relative X path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// Absolute Xpath

		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		// By id
		driver.findElement(By.id("email")).sendKeys("kvani253@gmail.com");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("abc").perform();
		// driver.findElement(By.id("pass")).sendKeys("abcd");
		// By xpath
		// driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		// By name
		// driver.findElement(By.name("firstname")).sendKeys("Vany");
		// By linktext
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("4042347890");
		driver.findElement(By.id("did_submit")).click();

		// By partial link text
		// driver.findElement(By.partialLinkText("Forgot")).click();

		// xpath with the and condition
		// driver.findElement(By.xpath("//*[@type='text' and
		// @name='lastname']")).sendKeys("abcd");
		// driver.findElement(By.xpath("//*[@id='u_0_r' or
		// @name='reg_email_']")).sendKeys("124356");

	}

}
