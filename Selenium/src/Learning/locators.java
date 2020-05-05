package Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Here we are clicking on forgtot account and passing email and click

public class locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/"); 
	    driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vany");
	 // driver.findElement(By.id("u_0_b")).click();
	 // Thread.sleep(5000);
	 // Instead 18, 19 20 lines we can use below logic 23,24,25,26
	 // Actions action = new Actions(driver);
     // action.sendKeys("kvani253@gmail.com").perform();
	 // action.sendKeys(Keys.ENTER).perform();  
	 // action.sendKeys("abcd").perform();
     // action.sendKeys(Keys.TAB).perform();
	    driver.findElement(By.linkText("Forgot account?")).click();
	 // Relative xpath for line 27 (//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a) 
	 // Absolute xpath for line 27 (/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a)  //full xpath
	 // By xpath ("//[@type='text'and @name='lastname']")   
	    driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("kvani@gmail.com");
	    driver.findElement(By.name("did_submit")).click();
	    System.out.println("The Title of the page is :"+driver.getTitle());
	  
	    //driver.close();

	}

}
