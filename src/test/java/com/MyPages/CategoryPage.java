package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage extends BasePage{

	public CategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By Category = By.xpath("//a[@href='/Admin/Category']");
	private By Create_Category = By.xpath("(//a[@class='btn btn-primary'])[1]");
	private By CategoryName = By.id("strCategoryName");
	private By Save = By.linkText("Save Category");
	
	
	
	
	public WebElement getcategory() {
		return getPageElement(Category);
	}
	
	public WebElement getcreatecategory() {
		return getPageElement(Create_Category);
	}
	
	public WebElement getcategoryName() {
		return getPageElement(CategoryName);
	}
	
	public WebElement getsave() {
		return getPageElement(Save);
	}
	public PlanPage doopen() {
		
		getcategory().click();
		getcreatecategory().click();
		getcategoryName().sendKeys("TestCreationPLanning12345");
		getsave().click();
		
		return getInstance(PlanPage.class);
		
	}


	

	


	}
