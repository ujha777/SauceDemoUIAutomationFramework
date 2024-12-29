package com.ui.test;

import static com.constants.Item.lohi;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.page.AddToCartPage;

@Listeners({com.ui.listeners.TestListeners.class})
public class ProductCheckoutTest extends TestBase{
	private AddToCartPage addToCartPage;

	@BeforeMethod(description = "User Logs into the application and searches for a product")
	public void setup() {
		addToCartPage = homePage.goToLoginPage().doLoginWith("standard_user", "secret_sauce").selectPrice(lohi).selectProductToAddIntoCart().goToCartPage();
	}
	
	@Test(description = "Verify if the logged in User is able to buy a item", groups = { "e2e", "smoke", "sanity" })
	public void checkoutTest() {
		
		boolean actualResult = addToCartPage.proceedToCheckout().addCustomerInfo().getPaymentInfo();
		Assert.assertEquals(actualResult, true);
	}
	@Test(description = "Verify if the logged in User is able Complete order", groups = { "e2e", "smoke", "sanity" })
	public void finsihOrder() {
		
		addToCartPage.proceedToCheckout().addCustomerInfo().completeOrder();
		
	}

}
