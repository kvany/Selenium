package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://filebin.net/");
	    driver.findElement(By.xpath("//*[@id='fileField']")).sendKeys("C:\\Users\\KRISHNA PC\\Desktop\\AghamaDoc\\vany.txt");

	}

}