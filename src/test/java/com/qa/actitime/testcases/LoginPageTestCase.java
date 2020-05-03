package com.qa.actitime.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.actitime.Base.DriverScript;
import com.qa.actitime.pages.LoginPage;



public class LoginPageTestCase extends DriverScript {
	
	LoginPage lp;
	//super keyword is used to call parent class constructor
	public LoginPageTestCase(){
		super();
	}
	
	@BeforeMethod
	public void pretest() 
	{
		initApp();
		lp = new LoginPage();
	}
	
	@AfterMethod
	public void posttest()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void TestVerifyActiLog()
	{
		boolean flag = lp.VerifyactiLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=2)
	public void VerifyLoginPageTitle()
	{
		String title = lp.VerifyLoginPageTitle();
		Assert.assertEquals("actiTIME - Login", title);
	}
	
	@Test(priority=3)
	public void TestValidationLoginFunction()
	{
		lp.ValidateLogin("admin", "manager");
	}
	
	/*@Test(priority=3)
	public void TestValidationLoginFunction()
	{
		lp.ValidateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
*/
}
