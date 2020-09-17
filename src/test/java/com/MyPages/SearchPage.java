package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

	private By Login = By.xpath("//a[contains(.,'Login')]");
	private By username = By.id("username");
	private By password = By.xpath("//input[@type='password']");
	private By Submit  = By.linkText("Login");
	private By Plans   = By.id("Plans & Pricing Plans & Pricing");
	public SearchPage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getLogin() {
		return getPageElement(Login);
	}
	
	public WebElement getUsername() {
		return getPageElement(username);
	}
	
	public WebElement getplans() {
		return getPageElement(Plans);
	}
	
	public WebElement getPassword() {
		return getPageElement(password);
		
	}
	
	public WebElement getSubmit() {
		return getPageElement(Submit);
	}
	
	public HomePage doOpen(String username,String password) throws InterruptedException {
		getLogin().click();
		getUsername().clear();
		getUsername().sendKeys(username);
		getPassword().clear();
	    getPassword().sendKeys(password);
		getSubmit().click();
		
		
		
		return getInstance(HomePage.class);
	}

	
}
