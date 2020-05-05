package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/"); 
		WebElement Menstab =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span"));
		WebElement Tshirts =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(Menstab).perform();
		action.moveToElement(Tshirts).click().perform();
		
		
		// TODO Auto-generated method stub

	}

}
