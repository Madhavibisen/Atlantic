Feature: Adding to the cart

Scenario: Adding the product to the cart

Given Getting driver from the Product Search Page of the application
When User click on the Add to cart button
And user click on the shopping cart button
And user click on the view cart button
Then Page title should contains "SUMMARY"

And Close the Browser