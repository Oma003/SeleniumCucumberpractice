Feature: Login to toolbox

  Scenario: Successful login with correct credentials
    Given I navigate to the toolbox login page
    When I enter "validUser" as the username
    And I enter "validPassword" as the password
    And I click on the login button
    Then I should be redirected to the toolbox dashboard

  Scenario: Unsuccessful login with incorrect credentials
    Given I navigate to the toolbox login page
    When I enter "invalidUser" as the username
    And I enter "invalidPassword" as the password
    And I click on the login button

  
  Scenario: Verify logo is displayed on the login page
    Given I navigate to the toolbox login page
    When I enter "validUser" as the username
    And I enter "validPassword" as the password
    And I click on the login button
    Then I should see the toolbox logo displayed
    
    