Feature: Login

Scenario Outline: Successful Login with valid credentials

Given Getting driver from the Landing Page of the application
When user click on SignIn
And User enters Email as <email> and Password as <password>
And Click on Login

Examples:
|email                         |password          |
|paliwalaman23@gmail.com       |JackNJill@123      |
#|modibhai@123gmail.com         |12345             |

