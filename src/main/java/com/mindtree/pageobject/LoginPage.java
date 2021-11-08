package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.LoginPageUI;

public class LoginPage {
	
	public WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getEmail() {
		return driver.findElement(LoginPageUI.email);
	}
	public WebElement getPassword() {
		return driver.findElement(LoginPageUI.password);
	}
	public WebElement getLogin() {
		return driver.findElement(LoginPageUI.login);
	}



}
