package com.testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class callwrapperfacebook {
	
	@Test
	public void facebooklogin() throws IOException, InterruptedException{
		
		wrappermethod wm = new wrappermethod();
		
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "vany@gmail.com");
		wm.enterbyid("pass", "abc");
	//	wm.clickbyxpath("//*[@type='submit']");here in xpath we changed the id to type and value submit
		wm.clickbyxpath("//*[@id='u_0_b']");
		wm.takescreenshot("C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\facebook.png");
		wm.closeapp();

}
}