package com.qa.hobspot.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.hobspot.utils.Constants;
import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest {

	
	BasePage basePage;
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeTest
	public void setUp() { 
		basePage = new BasePage();
		driver = basePage.init_driver("chrome");
		loginpage = new LoginPage(driver);
		
	}
	
	@Test(priority=2)
	public void verifyLoginPageTitleTest() {
	String title =	loginpage.getLoginPageTitle();
	System.out.println("login page title is: "+title);
	Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE,"login Page title is not matched...");
	
	}
	@Test(priority=1)
	public void verifySignUpLink() {
		Assert.assertTrue(loginpage.verifySignUpLink(), "SignUpLink is not displayed..");
	}
	
	@Test
	public void loginTest() {
		loginpage.doLogin("naveenanimation30@gmail.com", "Test@12345");
	}
	
	
	@AfterTest
	public void teardow() {
		driver.quit();
	}
}
