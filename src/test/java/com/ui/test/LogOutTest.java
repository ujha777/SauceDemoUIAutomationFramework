package com.ui.test;

import static com.constants.Item.lohi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.page.LogOutPage;

@Listeners({com.ui.listeners.TestListeners.class})
public class LogOutTest extends TestBase {
	private LogOutPage logoutPage;
	@BeforeMethod(description = "User Logs into the application and User is able Complete order")
	public void setup() {
		
		logoutPage = homePage.goToLoginPage().doLoginWith("standard_user", "secret_sauce").
				selectPrice(lohi).selectProductToAddIntoCart().goToCartPage().proceedToCheckout().addCustomerInfo().completeOrder();
	}
	
	@Test
	public void logoutFromTheWebSite() {
		logoutPage.doLogOut();
	}
	

}
