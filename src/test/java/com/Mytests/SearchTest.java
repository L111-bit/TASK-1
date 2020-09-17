package com.Mytests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyPages.CategoryPage;
import com.MyPages.HomePage;
import com.MyPages.PlanPage;
import com.MyPages.SearchPage;
import com.MyPages.UserManagementPage;
import com.MyPages.endPage;

public class SearchTest extends BaseTest {

	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
		String title = page.getInstance(SearchPage.class).getPageTitle();
		System.out.println(title);
	}
	@Test(priority = 2)
	public void verifyInvalidUsername() throws InterruptedException {
		HomePage homepage = page.getInstance(SearchPage.class).doOpen("RenukaQA","Test@1234");
		String Errormsg = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		Assert.assertEquals(Errormsg, "Username and/or Password Invalid");
		System.out.println(Errormsg);
	}
		
	@Test(priority = 3)
	public void verifyvalidUsername() throws InterruptedException {
		HomePage homepage = page.getInstance(SearchPage.class).doOpen("RenukaQA","Test@12345");
		String homePageTitle = homepage.getHomePageTitle();
		WebElement Username = driver.findElement(By.xpath("//span[text()=' R']"));
		Username.click();
		String UserName = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]")).getText();
		Assert.assertEquals(UserName,"RenukaQA QA Admin" );
		WebElement header1 =driver.findElement(By.xpath("//div[@class='col']//h1[1]"));
		String h1 = header1.getText();
		System.out.println(homePageTitle);
		System.out.println(UserName);
		System.out.println(h1);
		
	}
	
	@Test(priority = 4)
	public void verifyHomePageTitle() throws InterruptedException {
		String title = page.getInstance(HomePage.class).getPageTitle();
		UserManagementPage UMpage = page.getInstance(HomePage.class).doOpen();
		
	}
	
	@Test(priority =5)
	public void verifyUserManagementPage() throws InterruptedException {
		WebElement UserManagement = driver.findElement(By.xpath("//a[@href='/Admin/User']"));
		UserManagement.click();
		WebElement header2 = driver.findElement(By.xpath("//h1[text()[normalize-space()='Users Management']]"));
		String h2= header2.getText();
		Assert.assertEquals(h2,"Users Management");
		System.out.println(h2);
		CategoryPage Cpage = page.getInstance(UserManagementPage.class).doOpen();
		WebElement Search1 = driver.findElement(By.xpath("//input[@type='search']"));
		Search1.sendKeys("lokeshsubramanian");
		System.out.println("Records filtered");
	}
		
	@Test(priority = 6)
	public void verifyPlansANDPricing()throws InterruptedException {
		
		PlanPage Ppage = page.getInstance(CategoryPage.class).doopen();
		WebElement Search = driver.findElement(By.xpath("//input[@type='search']"));
		Search.sendKeys("TestCreationPLanning123");
		
	}
	@Test(priority = 7)
	public void verifyPlans()throws InterruptedException {
		
		   endPage Epage  = page.getInstance(PlanPage.class).doClose();
		WebElement SearchPlan = driver.findElement(By.xpath("//input[@type='search']"));
		SearchPlan.sendKeys("TestPlaningpricing");
	}
}
