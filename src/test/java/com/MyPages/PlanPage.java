package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanPage extends BasePage {

	
	public PlanPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By Plans_Pricing = By.xpath("//a[@href='/Admin/Subscription']"); 
	private By createPlan = By.linkText("Create Plan & Pricing");
	private By PlanName  = By.id("strSubscriptionPlan");
	private By No_Days = By.id("lngDaysCount");
	private By Pricing = By.id("lngPrice");
	private By No_Ques = By.id("lngQuestionCount");
	private By Save    = By.linkText("Create Plan");
	
	
	
	public WebElement getPPricing() {
		return getPageElement(Plans_Pricing);
	}
	
	public WebElement getcreateplan() {
		return getPageElement(createPlan);
	}
	
	public WebElement getPName() {
		return getPageElement(PlanName);
	}
	
	public WebElement getNO_Days() {
		return getPageElement(No_Days);
	}
	
	public WebElement getPricing() {
		return getPageElement(Pricing);
	}
	
	public WebElement getNO_Ques() {
		return getPageElement(No_Ques);
	}
	
	public WebElement getSave() {
		return getPageElement(Save);
	}
	
	public endPage doClose() {
		getPPricing().click();
		getcreateplan().click();
		getPName().sendKeys("TestPlaningpricing213");
		getNO_Days().sendKeys("4");
		getPricing().sendKeys("40");
		getNO_Ques().sendKeys("3");
		getSave().click();
		
		String Response = "Success";
		return null;
		
		
	}
	
	
	
	
}
