package com.saucedemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id = "user-name")
	private WebElement enteruser;
	@FindBy(id = "password")
	private WebElement enterPass;
	@FindBy(id = "login-button")
	private WebElement clickOnLogin;
	@FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']")
	private WebElement verifyError;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String userName) {
		enteruser.sendKeys(userName);
	}
	public void enterPassword(String pass) {
		enterPass.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		clickOnLogin.click();
	}
	public String verifyingError() {
		String error=verifyError.getText();
		return error;
	}

}
