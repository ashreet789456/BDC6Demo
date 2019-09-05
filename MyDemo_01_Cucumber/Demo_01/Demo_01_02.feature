Feature: Guest user actions in Demo Webshop

@sanity
Scenario: Users choice to opt for an account

Given user acess the sign-up page
And gets the credentials

@Regression @smoke
Scenario: Registered User access to login page of the Demo Webshop

Given user has valid account creds for DemoWebshop
And provide the valid creds
Then verifies the state for the login status

