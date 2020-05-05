package com.testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class CallwrapperOrangehrmLogin {

	@Test
	public void Orangelogin() throws IOException, InterruptedException{
		wrappermethod wm = new wrappermethod();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");
		wm.clickbyxpath("//b[contains(text(),'Admin')]");
		wm.enterbyid("searchSystemUser_userName","George");
		wm.dropdown("searchSystemUser_userType", "Admin");
		wm.enterbyid("searchSystemUser_employeeName_empName","washington");
		wm.dropdown("searchSystemUser_userType", "Admin");
		wm.dropdown("searchSystemUser_status", "Enabled");
		wm.clickbyid("searchBtn");
		wm.takescreenshot("C:\\Users\\KRISHNA PC\\eclipse-workspace\\Selenium\\Screenshots\\Orangehrm1.png");
		//		+ "C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\Orangehrm.png");
		
		
		
	}
}
