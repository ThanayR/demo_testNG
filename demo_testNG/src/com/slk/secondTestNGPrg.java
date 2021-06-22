package com.slk;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondTestNGPrg {
	
	@BeforeMethod    // before each test
	public void method_before() {
		System.out.println("Inside 2nd testNG Class ======== beforeMethod");
		//throw new SkipException("Tea Break");
	}
	
  @Test(groups = {"PerformanceTest"})
  public void test3() {
	  System.out.println("Inside 2nd testNG Class => Test Case # 3");
  }
  
  @Test(groups = {"SecurityTest", "PerformanceTest"})
  public void test4() {
	  System.out.println("Inside 2nd testNG Class => Test Case # 4");
  }
}
