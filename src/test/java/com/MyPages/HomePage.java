package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
    
	private By User = By.xpath("(//a[@class='dropdown-item'])[3]");
	private By createUser = By.linkText("Create Clinic & Admin User"); 
	private By clinicName = By.id("strClinicname");
	private By clinicAbbreviation = By.id("strClinicabbreviation");
	private By ClinicEmailAddress = By.id("strEmailID");
	private By ClinicContactNumber = By.id("strPhoneNumber");
	private By  ServiceType = By.id("lngClinicServicetypeID");
	private By ActivationStatus = By.id("blnIsActive");
	private By  Country =  By.id("lngCountry");
	private By  State  =  By.id("lngState");
	private By city  =  By.id("strCity");
	private By StreetAddress = By.id("strStreetAddress");
	private By ZipCode  = By.id("strZipCode");
	private By  Subscriptionplan = By.id("lngSubscriptionID");
	private By Maxusers = By.id("lngNumberOfIUsers");
	private By StartDate = By.id("dteUTCStartdate");
	private By EndDate = By.id("dteUTCEnddate");
	private By Username = By.id("strUserName");
	private By password = By.id("strPassword");
	private By FirstName = By.id("strFirstName");
	private By LastName   = By.id("strLastName");
	private By Email    =By.id("userstrEmailID");
	
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	

	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public WebElement getuser() {
		return getPageElement(User);
	}
	
	public WebElement getuname() {
		return getPageElement(Username);
	}
	
	public WebElement getemail() {
		return getPageElement(Email);
	}
	
	public WebElement getlname() {
		return getPageElement(LastName);
	}
	
	public WebElement getFname() {
		return getPageElement(FirstName);
	}
	
	public WebElement getpwd() {
		return getPageElement(password);
	}
	
	public WebElement getCreateUser() {
		return getPageElement(createUser);
	}
	
	public WebElement getClinicName() {
		return getPageElement(clinicName);
	}
	
	public WebElement getClinicAbbreviation() {
		return getPageElement(clinicAbbreviation);
	}
	
	public WebElement getClinicEmailAddress() {
		return getPageElement(ClinicEmailAddress);
	}
	
	public WebElement getClinicContactNumber() {
		return getPageElement(ClinicContactNumber);
	}
	
	public WebElement getServiceType() {
		return getPageElement(ServiceType);
	}
	
	public WebElement getActivationStatus() {
		return getPageElement(ActivationStatus);
	}
	
	public WebElement getCountry() {
		return getPageElement(Country);
	}
	
	public WebElement getState() {
		return getPageElement(State);
	}
	
	public WebElement getCity() {
		return getPageElement(city);
	}
	
	public WebElement getStreetAddress() {
		return getPageElement(StreetAddress);
	}
	
	public WebElement getzipcode() {
		return getPageElement(ZipCode);
	}
	public WebElement getSubPlan() {
		return getPageElement(Subscriptionplan);
	}
	public WebElement getmaxUser() {
		return getPageElement(Maxusers);
	}
	public WebElement getStartDate() {
		return getPageElement(StartDate);
	}
	public WebElement getEndDate() {
		return getPageElement(EndDate);
	}
	
	public UserManagementPage doOpen() throws InterruptedException {
		getuser().click();
		getCreateUser().click();
		getClinicName().sendKeys("CRUZZE");
		getClinicAbbreviation().sendKeys("CRZ");
		getClinicEmailAddress().sendKeys("lokeshsubramanian1807@gmail.com");
		getClinicContactNumber().sendKeys("8276356124");
		getCity().sendKeys("Coimbatore");
		getStreetAddress().sendKeys("123cbe123");
		getzipcode().sendKeys("641062");
		getmaxUser().sendKeys("1");
		
		Select servicetype = new Select(driver.findElement(By.id("lngClinicServicetypeID")));
		servicetype.selectByVisibleText("Hospital");
		
		Select country1= new Select(driver.findElement(By.id("lngCountry")));
		country1.selectByVisibleText("USA");
		
		Thread.sleep(1000);
		Select state1= new Select(driver.findElement(By.id("lngState")));
		state1.selectByVisibleText("Taxis");
		
		Select Subscription_plan = new Select(driver.findElement(By.xpath("//select[@id='lngSubscriptionID']")));
		Subscription_plan.selectByIndex(2);
		Thread.sleep(1000);
		getStartDate().click();
		driver.findElement(By.xpath("//span[@aria-label='September 22, 2020']")).click();
		getEndDate().click();
		
		
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		getuname().sendKeys("Lokeshh");
		getpwd().sendKeys("Subramanian@1");
		getFname().sendKeys("Loki");
		getlname().sendKeys("S");
		getemail().sendKeys("lokeshsubramanian18@gmail.com");
		driver.findElement(By.id("strMobileNumber")).sendKeys("8148162036");
		driver.findElement(By.linkText("Save")).click();
		return getInstance(UserManagementPage.class);
	}
	
}
