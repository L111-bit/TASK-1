package com.Mytests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.MyPages.BasePage;
import com.MyPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Page page;
	
	
	@BeforeTest
	@Parameters(value= {"browser"})
	
	
	public void Setup(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("ff")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		String baseURL = "http://1.22.171.26:7026/";
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		
		page= new BasePage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
}
