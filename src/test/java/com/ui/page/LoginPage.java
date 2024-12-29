package com.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.BrowserUtility;

public class LoginPage extends BrowserUtility {


	private static final By USERNAME_TEXT_BOX_LOCATOR=By.xpath("//input[@id='user-name']");
	private static final By PASSWORD_TEXT_BOX_LOCATOR=By.xpath("//input[@id='password']");
	private static final By SUBMIT_LOGIN_BUTTON_LOCATOR=By.xpath("//input[@id='login-button']");
	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	public MyAccountPage doLoginWith(String userName,String password) {
		enterText(USERNAME_TEXT_BOX_LOCATOR, userName);
		enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
		clickOn(SUBMIT_LOGIN_BUTTON_LOCATOR);
		MyAccountPage myAccountPage=new MyAccountPage(getDriver());
		return myAccountPage;
	}
}
