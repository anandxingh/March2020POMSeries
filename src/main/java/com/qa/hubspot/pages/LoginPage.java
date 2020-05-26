package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {

	private WebDriver driver;
	
	//By Locators -- OR
	
	By emailID = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	By signUpLink = By.id("Sign up");
	
	
	//Create Constructor of Page class
	
	public LoginPage(WebDriver driver) {
		this .driver= driver;
	}
	
	//Page Actions or methods:
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifySignUpLink() {
		return driver.findElement(signUpLink).isDisplayed();
	}
	
	public void doLogin(String username, String password) {
		driver.findElement(emailID).sendKeys(username);
		driver.findElement(this.password).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
}
