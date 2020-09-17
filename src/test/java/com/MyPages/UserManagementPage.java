package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage extends BasePage {

	private By createUser = By.linkText("Create User");
	private By  clinic = By.id("lngClinicID");
	private By  profile = By.id("lngProfileID");
	private By  firstname = By.id("strFirstName");
	private By lastname = By.xpath("//input[@id='strLastName']");
	private By uname = By.id("strUserName");
    private By pwd = By.xpath("//input[@id='strPassword']");
	private By Email = By.xpath("//input[@id='strEmailID']");
	private By save = By.xpath("//a[contains(@class,'btn btn-primary')]");
	
	
	
	public UserManagementPage(WebDriver driver) {
		super(driver);
		
	}

	public  String getUser_ManagementPageTitle() {
		
		return getPageTitle();
	}


	public WebElement getCreateUser() {
		return getPageElement(createUser);
	}
	public WebElement getClinic() {
		return getPageElement(clinic);
	}
	public WebElement getProfile() {
		return getPageElement(profile);
	}
	public WebElement getUName() {
		return getPageElement(uname);
	}
	public WebElement getFName() {
		return getPageElement(firstname);
	}
	public WebElement getLName() {
		return getPageElement(lastname);
	}
	public WebElement getEMail() {
		return getPageElement(Email);
	}
	public WebElement getPWD() {
		return getPageElement(pwd);
	}
	public WebElement getSave() {
		return getPageElement(save);
	}
	
	public CategoryPage doOpen() throws InterruptedException {
		
		getCreateUser().click();
		
		Thread.sleep(1000);
		Select clinic = new Select(driver.findElement(By.id("lngClinicID")));
		clinic.selectByVisibleText("Nandha");
		
		Select Profile = new Select(driver.findElement(By.id("lngProfileID")));
		Profile.selectByVisibleText("User");
		
		getUName().sendKeys("LokesSivan");
		getFName().sendKeys("Lokii");
		getLName().sendKeys("SSS");
		getEMail().sendKeys("lokeshsubramanian07@gmail.com");
		getPWD().sendKeys("Subramanian@1");
		getSave().click();
		
		
		
		
		
		return getInstance(CategoryPage.class);
	}
}
