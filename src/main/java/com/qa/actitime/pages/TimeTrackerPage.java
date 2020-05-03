package com.qa.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitime.Base.DriverScript;

public class TimeTrackerPage extends DriverScript {
	

//***************************************Page Elements***********************************************//
	@FindBy(id = "container_tasks")
	WebElement actiTaskMenu;
	@FindBy(id = "logoutLink")
	WebElement actiTaskLogout;
	@FindBy(xpath = "//a[@class='userProfileLink username']")
	WebElement actiProfileName;

//***************************************Page Initialization***********************************************//
// Page factory is class in POM which is used to initialize the page elements of the class

	public TimeTrackerPage() 
	{
		PageFactory.initElements(driver, TimeTrackerPage.class);
	}

//***************************************Page Actions Method***********************************************//
	public void VerifyElementDisplayed() 
	{
		actiTaskMenu.isDisplayed();
		actiTaskLogout.isDisplayed();
	}
	
	public void TimeTrackerLogout() 
	{
		actiTaskLogout.click();
	}
	
	public void clickTaskMenu()
	{
		actiTaskMenu.click();
	}
	
	public String getUserLoggedInText()
	{
		return actiProfileName.getText();
	}
	
	public String VerifyTimeTrackerTitle()
	{
		return driver.getTitle();
	}
}
