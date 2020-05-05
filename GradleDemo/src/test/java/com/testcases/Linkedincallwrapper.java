package com.testcases;

import java.io.IOException;
import org.testng.annotations.Test;

// there is wrapper program  WrappermethodGradle it is where we wrote all the code for this below program
public class Linkedincallwrapper {
	
	@Test
	
	public void  WrappermethodGradle() throws InterruptedException, IOException {
	WrappermethodGradlexcel wm = new WrappermethodGradlexcel();
	wm.linkedinlogin("https://www.linkedin.com/");
	wm.takescreenshot("C:\\Users\\KRISHNA PC\\eclipse-workspace\\GradleDemo\\Screenshot\\FacebookExcel.png");
	wm.closeapp();
	
}


}



