package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;

import com.Seleniumutils.seleniumutils;
import com.baseclass.Library;
import com.pages.HRM_Adminpages;
import com.pages.HRM_loginpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmadminstep extends Library {

	seleniumutils utils;
	HRM_loginpages login;
	HRM_Adminpages admin;
	 

	@Given("^Launch orangehrm  and login$")
	public void launch_orangehrm_and_login() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		launchApplication();
		login = new HRM_loginpages(driver);
		login.typeUsernamePwd("Admin", "admin123");
	    
	}

	@When("^select Admin tab$")
	public void select_Admin_tab()  {
	 admin = new HRM_Adminpages(driver);
	 admin.clickadmin();
	 }

	@Then("^Enter username$")
	public void enter_username()  {
	    admin.username("Hannah Flores");
	}

	@Then("^Select userrole$")
	public void select_userrole() {
	admin.userroll("ESS");
	}

	@Then("^Enter Employeename$")
	public void enter_Employeename() {
	admin.employeename("vany mohan");
	}

	@Then("^Select  Status$")
	public void select_Status() {
	admin.status("Enabled");
	
	}

	@Then("^Click Sreach button$")
	public void click_Sreach_button()  {
	   admin.clicksearch();
	   quit();
	}

	@Then("^Take pic$")
	public void Take_pic() throws IOException {
		utils = new seleniumutils(driver);
		utils.getTitle();
		utils.to_take_screenshot("src\\test\\resources\\Screenshot\\adminhrm.png");
		quit(); 
	}
	@Then("^quit application$")	
	public void quit_application()  {
			quit();    
		
		}
		
		
	}



