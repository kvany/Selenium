package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedinaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email-address']")).sendKeys("kvani234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("tuiuui9");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("join-form-submit")).click();
		
		
		
	
		

	}

}
