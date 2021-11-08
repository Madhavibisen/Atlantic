package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.CartPageUI;

public class CartPage {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getCart() {
		return driver.findElement(CartPageUI.addToCart);
	}

	public WebElement getShoppingcart() {
		return driver.findElement(CartPageUI.shoppingcart);
	}
	
	public WebElement getVeiwCart() {
		return driver.findElement(CartPageUI.viewCart);
	}
	public WebElement getTitleAfterAdding() {
		return driver.findElement(CartPageUI.title);
	}
}
