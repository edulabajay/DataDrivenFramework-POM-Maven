package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPage {
	
WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver; //to map my webdriver in this object location using this keyword 
		
	}

	////Object Repositories [Collection of WebElement]
	
	By searchbox = By.xpath("//textarea[@id='APjFqb']");
	By search_buttn = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	By facebook_signup = By.xpath("//h3[normalize-space()='Facebook - log in or sign up']");

	public void searchgoogle(String Searchinput) {

		//driver .findElement(By.xpath("//textarea[@id='APjFqb']"));
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			driver.findElement(search_buttn).click();
		} catch (Exception e) 

		{

			System.out.println("Exception Caught"+ e.getMessage());

		}
	}

	public void fb_signup_link() {

		try {
			driver.findElement(facebook_signup).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Caught"+ e.getMessage());

		}
	
	}
}

