package com.ui.page;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.BrowserUtility;

public class AddToCartPage extends BrowserUtility{

	private static final By ALL_PRODUCT_LISTS_NAME=By.xpath("//div[@class='inventory_item_name']");
	private static final By CLICK_ON_CHECKOUT_BUTTON=By.xpath("//button[@id='checkout']");
	
	public AddToCartPage(WebDriver driver) {
		super(driver);
		
	}
	//Verify if the right products were added to cart
    public boolean isCorrectProductAddedToTheCart() {
    	 // Retrieve the list of products in the cart
    	List<WebElement> productNamesList=getAllElements(ALL_PRODUCT_LISTS_NAME);
        // Extract the product names from the cart items
    	List<String> actualProductNames = productNamesList.stream().map(WebElement::getText).collect(Collectors.toList());
    	 // List of expected products
        List<String> expectedProductNames = Arrays.asList("Sauce Labs Bolt T-Shirt", "Test.allTheThings() T-Shirt (Red)");
     // Verify the products in the cart
        if (actualProductNames.containsAll(expectedProductNames) && expectedProductNames.containsAll(actualProductNames)) {
        	return true;
        }else {
            return false;
        }
		
    }
    
    public CheckOutPage proceedToCheckout() {
    	clickOn(CLICK_ON_CHECKOUT_BUTTON);
    	return new  CheckOutPage(getDriver());
    }
    
}
