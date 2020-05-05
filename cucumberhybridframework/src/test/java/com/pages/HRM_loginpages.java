package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* pages testcase.feature, step definition, testrunner(test.java) to run the program*/
public class HRM_loginpages {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement user;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	

	public HRM_loginpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void typeUsernamePwd(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
		Login.click();
	}
	

	}

