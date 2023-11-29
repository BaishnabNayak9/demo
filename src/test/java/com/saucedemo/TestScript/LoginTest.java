package com.saucedemo.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.Base.Base;
import com.saucedemo.Pom.HomePage;
import com.saucedemo.Pom.LoginPage;
import com.saucedemo.Utilities.Utilities;

public class LoginTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	Utilities utilities;
	@Test(priority = 1)
	public void loginwithValidCredential() {
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		utilities=new Utilities();
		driver.get(utilities.validPopData.getProperty("URL"));
		loginPage.enterUserName(utilities.validPopData.getProperty("validUsername"));
		loginPage.enterPassword(utilities.validPopData.getProperty("validPassword"));
		loginPage.clickOnLoginButton();
		Assert.assertTrue(homePage.verifyingHomePage().contains(utilities.validPopData.getProperty("verifyHomePageUsingProducts")),"You are not Logged to home page");
		
	}
	@Test(priority = 2)
	public void loginWithInvalidUsernameAndInvalidPassword() {
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		utilities=new Utilities();
		driver.get(utilities.validPopData.getProperty("URL"));
		loginPage.enterUserName(utilities.invalidProData.getProperty("invalidUsername"));
		loginPage.enterPassword(utilities.invalidProData.getProperty("invalidPassword"));
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.verifyingError().contains(utilities.invalidProData.getProperty("verifyingError")),"Error message not displayed");
		
		
	}

}
