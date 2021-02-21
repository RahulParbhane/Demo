Feature: Amazon order Page
In order to check my order details 
As registered user
I want to specify the features of order details page


Background: 
Given a registered user exists
Given user is on Amazon login page
When user enters username
And user enters password
And user clicks on login button
Then user navigate to order page

Scenario: Check previous order details
When user clicks on order link
Then user checks the previous order details

Scenario: Check Open order details
When user clicks on Open order link
Then user checks the Open order details

Scenario: Check Cancelled order details
When user clicks on Cancelled order
Then user checks the Cancelled order details