package com.ui.page;

import org.openqa.selenium.WebDriver;
import static com.constants.Env.QA;

import com.constants.Browser;
import com.utilities.BrowserUtility;
import com.utilities.JSONUtility;

public class HomePage extends BrowserUtility {

	public HomePage(Browser browser, boolean isHeadless) {
		super(browser, isHeadless); // To Call the Parent Class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}

	
	public HomePage(WebDriver driver) {
		super(driver); // To Call the Parent Class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}
	public LoginPage goToLoginPage() {//-->Page Function-->do not use void return type in Page Object Design Pattern
		//logger.info("Trying to perform click to go to Sign in Page");
	//	clickOn(SIGN_IN_LINK_LOCATOR);
		//passing the one session object of One Page to another Page by using getDriver method
		LoginPage loginPage= new LoginPage(getDriver());
		return loginPage;
	}
}
