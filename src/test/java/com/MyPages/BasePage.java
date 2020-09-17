package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		
		return getPageElement(locator).getText();
	}

	@Override
	public WebElement getPageElement(By locator) {
		WebElement element=null;
		try {
			waitforElementPresent(locator);
			element= driver.findElement(locator);
			return element;
			
		}catch(Exception e) {
			System.out.println("some error occured while creating element"+locator.toString());
			e.printStackTrace();
		}
		return element;
	}
	
	
	@Override
	public void waitforElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e){
			System.out.println("some error occured while waiting for element"+locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitforPageTitle(String Title) {
		
		try {
			wait.until(ExpectedConditions.titleContains(Title));
		}catch(Exception e){
			System.out.println("some error occured while waiting for page title"+Title);
		}
	}

}
