package com.mindtree.StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageobject.CartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CartPageSD {
	static WebDriver driver;
	public CartPage cp;

    @Given("^Getting driver from the Product Search Page of the application$")
    public void getting_driver_from_the_product_search_page_of_the_application() throws Throwable {
    	driver = ProductSearchSD.getDriver();
    }

    @When("^User click on the Add to cart button$")
    public void user_click_on_the_add_to_cart_button() throws Throwable {
    	cp = new CartPage(driver);
    	cp.getCart().click();
    	Thread.sleep(7000);
    	
    }

    @Then("^Page title should contains \"([^\"]*)\"$")
    public void page_title_should_contains_something(String strArg1) throws Throwable {
    	cp.getTitleAfterAdding().getText().contains(strArg1);
    }

    @And("^user click on the shopping cart button$")
    public void user_click_on_the_shopping_cart_button() throws Throwable {
    	cp.getShoppingcart().click();
    }

    @And("^user click on the view cart button$")
    public void user_click_on_the_view_cart_button() throws Throwable {
    	cp.getVeiwCart().click();
    	Thread.sleep(7000);
    }

    @And("^Close the Browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
    }

}