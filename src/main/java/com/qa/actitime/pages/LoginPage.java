package com.qa.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitime.Base.DriverTest;

public class LoginPage extends DriverTest{
	
//***************************************Page Elements***********************************************//
	@FindBy(id="logoContainer") WebElement actilogo;
	@FindBy(id="username") WebElement actiuser;
	@FindBy(name="pwd") WebElement actipwd;
	@FindBy(id="loginButton") WebElement actiloginbtn;

//***************************************Page Initialization***********************************************//
	//Page factory is class in POM which is used to initialize the page elements of the class 
	public LoginPage()
	{
		PageFactory.initElements(driver, LoginPage.class);
	}
	
//***************************************Page Actions Method***********************************************//
	public boolean VerifyactiLogo()
	{
		return actilogo.isDisplayed();
	}
	
	public void ValidateLogin(String username, String password)
	{
		actiuser.sendKeys(username);
		actipwd.sendKeys(password);
		actiloginbtn.click();
	}
	
	public String VerifyLoginPageTitle()
	{
		return driver.getTitle();
	}

}