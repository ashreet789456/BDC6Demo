Feature: Login and adding items to cart in Demo Webshop 

Background: Launching of the home page
Given user clicks on Demo Web shop icon
And ensuring user is directed to home page

Scenario: Login in to DemoWebshop app


Given Click on to Login button
Then Enter login mail id and password
And click the login button

Scenario: Adding book to the cart


Given Click on to the Books in Categories
Then Click on any books
When User clicks on books add to cart
And item is added to cart


Scenario: Adding any item to the cart


Given Click on to the Electronics in Categories
Then Click on any Cellphones
When User clicks on Smartphone add to cart
And item is added to cart

