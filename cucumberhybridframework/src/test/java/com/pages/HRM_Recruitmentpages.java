package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM_Recruitmentpages {
	WebDriver driver;

	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;

	@FindBy(id="candidateSearch_jobTitle")
	WebElement jobtitle;

	@FindBy(id="candidateSearch_status")
	WebElement Status;

	@FindBy(id="candidateSearch_candidateName")
	WebElement CandidateName;

	@FindBy(id="candidateSearch_keywords")
	WebElement Keywords;
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement MethodofApplication;
	@FindBy(id="btnSrch")
	WebElement Search;
	

	public HRM_Recruitmentpages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initializing pagefactory to driver elements
	}
	public void clickrectrutment() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(recruitment));// some times it work and sometimes not so we need to write this bit logic
		recruitment.click();// Here sys is throwing some error some time and working some time so we gave wait than it is clicking
		
	}
	public void selectjobtitle(String text) {
		Select sel=new Select(jobtitle);
		sel.selectByVisibleText(text);
	}
	public void status(String text) {
		Status.sendKeys(text);
	}
	public void Candidate(String text) {
		CandidateName.sendKeys(text);
	}
	public void keywords(String text) {
		Keywords.sendKeys(text);
	}
	public void methodofapplication(String text) {
		Select sel=new Select(MethodofApplication);
		sel.selectByVisibleText(text);
	}
	public void clicksearch() {
		Search.click();
	}
	

}
