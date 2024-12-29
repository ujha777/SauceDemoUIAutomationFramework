package com.ui.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.BrowserUtility;

public class PaymentPage extends BrowserUtility{
	private static final By PAYMENT_INFO_ID=By.xpath("//div[@data-test='payment-info-value']");
	private static final By PRICE_DETAILS_INFO=By.xpath("//div[@data-test='total-label']");
	private static final By CLICK_ON_FINSIH_BUTTON=By.xpath("//button[@id='finish']");
	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Extract payment information and price (don’t miss validations)
   public boolean getPaymentInfo() {
	  String paymentInfo=getVisibleText(PAYMENT_INFO_ID);
	 String totalPrice= getVisibleText(PRICE_DETAILS_INFO);
	 String combinedInfo=paymentInfo +" "+ totalPrice;
	 System.out.println(combinedInfo);
	 
	 String expectedResult="SauceCard #31337 Total: $34.54";
		
		if (combinedInfo.equalsIgnoreCase(expectedResult)) {
			return true;
		}
	 return false;
	
   }
   
   public LogOutPage completeOrder() {
	   clickOn(CLICK_ON_FINSIH_BUTTON);
	   return new LogOutPage(getDriver());
   }

}
