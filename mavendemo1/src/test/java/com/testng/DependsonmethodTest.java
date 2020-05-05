package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonmethodTest {
	
	 @Test
	  
	  public void login() {
		  System.out.println("login");
 }
	  
	 @Test (dependsOnMethods = {"login"})
	  public void search() {
		 
		 Assert.assertEquals("abc", "xyz");
		  System.out.println("search");
	  }
	  
	 @Test  (dependsOnMethods = {"search"},alwaysRun=false)
	
	// @Test  (dependsOnMethods = {"search"},alwaysRun=true)
	  public void logout() {
		  System.out.println("logout");
	  }

}   
//* Here we have three methods login, search, login, next search it depends login on abc and xyz these are actual and expected
//and logout depends on search*//
