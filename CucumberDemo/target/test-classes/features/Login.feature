Feature: Application Login

Scenario: Home Page default login
Given User is on Netbanking landing page
When User login to app with uname and password
Then Home page is populated
And cards are displayed