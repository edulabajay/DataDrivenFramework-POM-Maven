package com.testpages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Facebookpage;
import com.pages.GoogleSearchPage;
//import com.pages.GoogleSearchPage;
//import com.pages.Search_pagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_Googlesearch {

	WebDriver driver;
	
	GoogleSearchPage global_declare_googlesearchobjectrep;
	//Search_pagefactory page_factory;
	Facebookpage global_declare_fb_loginpage;
	//Facebookpage page_login;
	
	@BeforeTest
	public void beforetest() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(3000);
	    driver.get("https://www.google.com/");
	}
	@Test(priority=0)
	public void Verify_searchOption() throws InterruptedException {
		//Local declare object
		
		GoogleSearchPage page=new GoogleSearchPage(driver);
			page.searchgoogle("facebook");
			
		/*
		page_factory = new Search_pagefactory(driver);
		page_factory.searchgoogle("facebook");
*/	}
	
	@Test(priority=1)
	public void Verify_fb_signup() throws InterruptedException {
		
		global_declare_googlesearchobjectrep = new GoogleSearchPage(driver);
		global_declare_googlesearchobjectrep.fb_signup_link();
	
		/*
		page_factory = new Search_pagefactory(driver);
        page_factory.fb_signup_link();
	
*/	}

	@Test(priority=2)
	public void Verify_login() {

		Facebookpage user_login = new Facebookpage(driver);
		user_login.Username();
		user_login.Password();
		user_login.Loginbtn();
	
		/*
		page_login = new Facebookpage(driver);
		
		page_login.Username();
		
		page_login.Password();
		
		page_login.Loginbtn();*/
	}
	

	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
