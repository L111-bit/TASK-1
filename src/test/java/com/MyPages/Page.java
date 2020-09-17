package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public Page(WebDriver driver) {
	this.driver=driver;
	this.wait= new WebDriverWait(this.driver,20);
	
	}
	
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getPageElement(By locator);
	
	
	
	public abstract void waitforElementPresent(By locator);
	
	public abstract void waitforPageTitle(String Title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	
		
	
}
