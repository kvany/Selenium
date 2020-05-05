package com.stepdefinition;

import java.io.IOException;

import com.Seleniumutils.seleniumutils;
import com.baseclass.Library;
import com.pages.HRM_loginpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmloginstep extends Library {

	seleniumutils utils;
	HRM_loginpages login;
	
	@Given("^launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws IOException  {
		launchApplication();
	   
	}
	@When("^login page is opened$")
	public void login_page_is_opened() throws IOException  {
		utils = new seleniumutils(driver);
		utils.getTitle();
		utils.to_take_screenshot("src\\test\\resources\\Screenshot\\loginhrm.png");
	    
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username, String password)  {
		login = new HRM_loginpages(driver);
				login.typeUsernamePwd(username, password);
	}
	
	@Then("^click the login button$")
	public void click_the_login_button()  {
	   
}

	@Then("^take screenshot and close the browser$")
	public void take_screenshot_and_close_the_browser()  {
			utils = new seleniumutils(driver);
			utils.getTitle();
			utils.to_take_screenshot("src\\test\\resources\\Screenshot\\Recruit.png");
			quit();
		quit();
		
	    
	}
	

}
