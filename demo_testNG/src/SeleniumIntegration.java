

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SeleniumIntegration {
	WebDriver driver;
	
	@BeforeClass
	public void classInitialize() {
		driver = null;
	}
	
	@AfterClass
	public void terminate() {
		driver = null;
	}	
	
	@BeforeMethod
	public void setup() {
		String chromeDriverPath = "D:\\SeleniumDump\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();  
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test 
	public void test6() {		 
		driver.get("http://www.google.com");
		String expPageTitle  = "Google123";
		String actPageTitle = driver.getTitle();		
		System.out.println("Actual Title: " + driver.getTitle());
		/*
		 * try { Assert.assertEquals(actPageTitle, expPageTitle); }catch(Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		//Assert.assertEquals(actPageTitle, expPageTitle);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actPageTitle, expPageTitle);
		System.out.println("End of Program");
		softAssert.assertTrue(5<2);
		softAssert.assertAll();
	}
	
	//@Test (dependsOnMethods = {"test6"})
	@Test 
	public void test7() {		 
		driver.get("http://www.slksoftware.com");
		System.out.println(driver.getTitle());
	}
}
