package com.stepdefinition;

import java.io.IOException;

import com.Seleniumutils.seleniumutils;
import com.baseclass.Library;
import com.pages.HRM_Adminpages;
import com.pages.HRM_Recruitmentpages;
import com.pages.HRM_loginpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmrecruitmentstep extends Library{
	
	seleniumutils utils;
	HRM_loginpages login;
	HRM_Recruitmentpages Recruit;
	 

	@Given("^Launch orangehrm application and login$")
	public void launch_orangehrm_application_and_login() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		launchApplication();
		login = new HRM_loginpages(driver);
		login.typeUsernamePwd("Admin", "admin123");
	}
	
	@When("^select Recruitment tab$")
	public void select_Recruitment_tab()  {
		Recruit = new HRM_Recruitmentpages(driver);
				Recruit.clickrectrutment();		
	}
	@Then("^select selectjobtitle$")
	public void select_selectjobtitle() {
		Recruit.selectjobtitle("CEO");
	}

	@Then("^select status$")
	public void select_status()  {
		Recruit.status("Interview passed");
	    
	}

	@Then("^Enter candidate name$")
	public void enter_candidate_name()  {
	   Recruit.Candidate("vany");
	}

	@Then("^Enter keywords$")
	public void enter_keywords()  {
		Recruit.keywords("Awesome");
	}

	@Then("^Select  method of application$")
	public void select_method_of_application()  {
		Recruit.methodofapplication("Manual");
	}
	@Then("^Click button$")
	public void click_button()  {
	   Recruit.clicksearch();
	}

	@Then("^Take screenshot  and quit application$")
	public void take_screenshot_and_quit_application() throws IOException {
		utils = new seleniumutils(driver);
		utils.getTitle();
		utils.to_take_screenshot("src\\test\\resources\\Screenshot\\Recruit.png");
		quit();
		
	}



}
