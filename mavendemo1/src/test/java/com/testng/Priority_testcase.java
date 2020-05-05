package com.testng;

import org.testng.annotations.Test;

public class Priority_testcase {
	
	@Test(priority=2)
	public void testcase1() {
		System.out.println("testcase1");
	}
		 
	@Test(priority=3,invocationCount=3,invocationTimeOut=5)
	// this method alone will run 3 times
	public void testcase2() {
	   System.out.println("testcase2");
			  
		  }
	 @Test(priority=1)
	 public void testcase3() {
		System.out.println("testcase3");
}
		  }
