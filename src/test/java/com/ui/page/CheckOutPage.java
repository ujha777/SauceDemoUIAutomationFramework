package com.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.BrowserUtility;

public class CheckOutPage extends BrowserUtility {

	private static final By ENTER_FIRST_NAME_IN_TEXT_BOX=By.xpath("//input[@id='first-name']");
	private static final By ENTER_LAST_NAME_IN_TEXT_BOX=By.xpath("//input[@id='last-name']");
	private static final By ENTER_PIN_CODE_IN_TEXT=By.xpath("//input[@id='postal-code']");
	private static final By CLICK_ON_CONTINUE_BUTTON=By.xpath("//input[@id='continue']");
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public PaymentPage addCustomerInfo() {
		enterText(ENTER_FIRST_NAME_IN_TEXT_BOX, "John");
		enterText(ENTER_LAST_NAME_IN_TEXT_BOX, "Cena");
		enterText(ENTER_PIN_CODE_IN_TEXT, "123456");
		clickOn(CLICK_ON_CONTINUE_BUTTON);
		
		return new PaymentPage(getDriver());
		
	} 

}
