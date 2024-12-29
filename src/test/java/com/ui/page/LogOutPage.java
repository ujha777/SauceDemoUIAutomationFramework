package com.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.BrowserUtility;

public class LogOutPage extends BrowserUtility{

	private static final By CLICK_ON_BACK_TO_HOME=By.xpath("//button[@id='back-to-products']");
	private static final By CLICK_ON_OPEN_MENU_BUTTON=By.xpath("//button[text()='Open Menu']");
	private static final By CLICK_ON_LOG_OUT_BUTTON=By.xpath("//a[text()='Logout']");
	public LogOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void doLogOut() {
		clickOn(CLICK_ON_BACK_TO_HOME);
		clickOn(CLICK_ON_OPEN_MENU_BUTTON);
		clickOn(CLICK_ON_LOG_OUT_BUTTON);
	}

}
