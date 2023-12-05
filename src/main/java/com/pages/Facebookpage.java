package com.pages;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {

	WebDriver driver;
	
	public Facebookpage(WebDriver driver) {
		
		this.driver = driver;
		
	}

		/*
		PageFactory.initElements(driver, this);
	}
		////Object Repositories [WebElement]

	@FindBy(xpath = "//input[@id='email']") public WebElement Username;  
	@FindBy(xpath = "//input[@id='pass']") public WebElement Password;
	@FindBy(xpath = "//button")public WebElement Login_button;
	
	


public void Username() {
	Username.sendKeys("8390391858");	
}
	
public void Password() {
	Password.sendKeys("8390391858");
	
}
public void Loginbtn() {
	
	Login_button.click();	
	
*/	
	

	
	
	////Object Repositories[WebElement]

	By Username = By.xpath("//input[@id='email']");
	By Password = By.xpath("//input[@id='pass']");
	By Login_button = By.xpath("//button");
	


public void Username() {
	driver.findElement(Username).sendKeys("8390391858");
	
}
public void Password() {
	driver.findElement(Password).sendKeys("8390391858");
	
}
public void Loginbtn() {
	
	driver.findElement(Login_button).click();
    String title = driver.getTitle();
    assertEquals(title, "Log in to Facebook");

}



}