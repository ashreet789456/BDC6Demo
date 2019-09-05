Feature: BDC Demo for parameterization

Scenario: I want to cross check the multipl users access for login

Given I am launching the webshop url
Then I will check on Login
When I enter username"<>" and password "<>"
And click on submit button
Then verify for user account status
  
      | uername | password |
      | ranji123@gmail.com |Password | 
      | ashreet21@gmail.com |ASalimath@21 | 
