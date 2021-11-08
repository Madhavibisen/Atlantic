package com.mindtree.StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageobject.LandingPage;
import com.mindtree.pageobject.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginPageSD {
	
	public LoginPage login;
	public LandingPage landing;
	
	static WebDriver driver;

    @Given("^Getting driver from the Landing Page of the application$")
    public void getting_driver_from_the_landing_page_of_the_application() throws Throwable {
    	driver = LandingPageSD.getDriver();
    }

    @When("^user click on SignIn$")
    public void user_click_on_signin() throws Throwable {
    	landing = new LandingPage(driver);
    	landing.getLogin().click();
    	
    }

    @And("^User enters Email as (.+) and Password as (.+)$")
    public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
    	login = new LoginPage(driver);
    	login.getEmail().sendKeys(email);
    	login.getPassword().sendKeys(password);
    	Thread.sleep(3000);
    }

    @And("^Click on Login$")
    public void click_on_login() throws Throwable {
    	login.getLogin().click();
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }

}
