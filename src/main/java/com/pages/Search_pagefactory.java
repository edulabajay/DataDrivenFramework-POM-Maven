package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_pagefactory {
	WebDriver driver;



	public Search_pagefactory(WebDriver driver) {


		PageFactory.initElements(driver, this);
	
	}
	////Object Repositories [WebElement]

	@FindBy(xpath = "//textarea[@id='APjFqb']") public WebElement searchbox ;
	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']") public WebElement search_buttn;
	@FindBy(xpath = "//h3[normalize-space()='Facebook - log in or sign up']") public WebElement facebook_signup;




	public void searchgoogle(String Searchinput) {

		try {
			searchbox.sendKeys(Searchinput);
			search_buttn.click();
		} catch (Exception e) 

		{

			System.out.println("Exception Caught"+ e.getMessage());

		}
	}	


	public void fb_signup_link() {

		try {
			 facebook_signup.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Caught"+ e.getMessage());

		}






	}
}
