package com.qa.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.actitime.Base.DriverScript;

public class TaskListPage extends DriverScript{
	
	WebDriver driver;
//***************************************Page Elements***********************************************//
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement taskNewButton;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement CreateNewCustomer;
	@FindBy(xpath = "//div[@id='customerLightBox_content']//div//div[contains(@class,'details selected')]") WebElement DetailsTab;
	@FindBy(xpath = "//div[contains(@class,'customerNameDiv')]//input[contains(@placeholder,'Enter Customer Name')]") WebElement CustomerName;
	@FindBy(xpath = "//textarea[contains(@placeholder,'Enter Customer Description')]") WebElement CustomerDescription;
	@FindBy(xpath = "//div[contains(@class,'emptySelection')]") WebElement SelectCustomer;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement CreateCustomer;
	
//***************************************Page Initialization***********************************************//
public TaskListPage() {
	PageFactory.initElements(driver, TaskListPage.class);
}

//***************************************Page Actions Method***********************************************//

public void ClickAddNewButton()
{
	taskNewButton.click();
}

public void ClickOnNewCustomer()
{
	CreateNewCustomer.click();
}

public void clickOnDetailsTab()
{
	DetailsTab.click();
}

public void EnterCustomerName(String customer)
{
	 CustomerName.sendKeys(customer);
}

public void enterCustomerDescription(String description)
{
	CustomerDescription.sendKeys(description);
}
public void selectProject(int index)
{
	Select select = new Select(SelectCustomer);
	select.selectByIndex(index);
}

public void clickCreateCustomer()
{
	CreateCustomer.click();
}

public String getTaskListPageTitle() 
{
	return driver.getTitle();
}
}
