package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
	  @Test
  
	  public void testcase1() {
		  System.out.println("testcase1");
  }
	  
	  @Test
	  public void testcase2() {
		  System.out.println("testcase2");
	  }
	  
	  @Test
	  public void testcase3() {
		  System.out.println("testcase3");
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod: launch app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod: closed app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass: prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass: clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest: smoke testing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest: generate report");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite:open db connection");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite: close db connection");
  }

}
