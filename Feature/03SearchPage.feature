Feature: Searching of product

Scenario Outline: Successfully searching for the product

Given Getting driver from the Login Page of the application
When user clicks on the searchbox
Then user enters the product as <book>
And Hit the enter button

Examples:
|book|
|GMAT|
