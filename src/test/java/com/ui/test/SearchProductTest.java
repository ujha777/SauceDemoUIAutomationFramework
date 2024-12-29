package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.constants.Item.*;
import com.ui.page.MyAccountPage;
@Listeners({com.ui.listeners.TestListeners.class})
public class SearchProductTest extends TestBase {
	private MyAccountPage myAccountPage;
	
	@BeforeMethod(description = "Valid user logs into the application")
	public void setup() {
		myAccountPage = homePage.goToLoginPage().doLoginWith("standard_user", "secret_sauce");
	}
	
	
	@Test(description = "Verify product add to cart correctly", groups = {
			"e2e", "smoke", "sanity" })
	public void addToCart() {
		
		boolean actualResult = myAccountPage.selectPrice(lohi).selectProductToAddIntoCart().goToCartPage().isCorrectProductAddedToTheCart();
		Assert.assertEquals(actualResult, true);		
	}
	

}
