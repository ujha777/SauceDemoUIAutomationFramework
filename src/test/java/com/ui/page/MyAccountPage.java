package com.ui.page;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.constants.Item;
import com.utilities.BrowserUtility;

public class MyAccountPage extends BrowserUtility {

     
	private static final By PRICE_DROP_DOWN_LOCATOR=By.xpath("//select[@class='product_sort_container']");
	private static final By  SELECT_PRODUCT_TO_ADD_INTO_CART=By.xpath("//div[@class='inventory_item_name ']");
	private static final By THIRD_PRODUCT_ADD_TO_CART_BUTTON=By.xpath("//div[@class='inventory_list']/div[3]/div[2]/div[2]/button");
	private static final By FOURTH_PRODUCT_ADD_TO_CART_BUTTON=By.xpath("//div[@class='inventory_list']/div[4]/div[2]/div[2]/button");
	private static final By CART_LINK=By.xpath("//a[@class='shopping_cart_link']");
	
	
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		
		
	}
	
	public MyAccountPage selectPrice(Item item){
		selectFromDropDown(Item.lohi.toString(),PRICE_DROP_DOWN_LOCATOR);
		return new MyAccountPage(getDriver());
	}
	
	public MyAccountPage selectProductToAddIntoCart() {		
		List<WebElement> productNames = getAllElements(SELECT_PRODUCT_TO_ADD_INTO_CART);
		for (WebElement webElement : productNames) {
			if (webElement.getText().equalsIgnoreCase("Sauce Labs Bolt T-Shirt")||
					webElement.getText().equalsIgnoreCase("Test.allTheThings() T-Shirt (Red)")) {
				 webElement.findElement(THIRD_PRODUCT_ADD_TO_CART_BUTTON).click();
				 webElement.findElement(FOURTH_PRODUCT_ADD_TO_CART_BUTTON).click();
				 break;
			}		   
		}
		return new MyAccountPage(getDriver());
	}
	
	public AddToCartPage goToCartPage() {
		clickOn(CART_LINK);
		return new AddToCartPage(getDriver());		
	}



	
}
