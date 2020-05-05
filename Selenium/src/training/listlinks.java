package training;

import java.util.List;
import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();

		// Get list of web-elements with tagName - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Object linkCount = allLinks.size();

		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		System.out.println("no of links" + linkCount);
		// Commenting driver.quit() for user to verify the links printed
		// driver.quit();
	}
}