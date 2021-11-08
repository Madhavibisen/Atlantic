package com.mindtree.uistore;

import org.openqa.selenium.By;

public class CartPageUI {
	
	public static By addToCart = By.xpath("//*[@id=\"product-addtocart-button\"]/span");
	public static By shoppingcart = By.className("df-text");
	public static By viewCart = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/a[1]/span/span");
	public static By title = By.xpath("//*[@class='summary title']");

}
