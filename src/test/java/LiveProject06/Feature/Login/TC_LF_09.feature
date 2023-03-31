Feature: Login Functionality

  #1. Click on 'My Account' Dropmenu
  #2. Click on 'Login' option
  #3. Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>
  #4. Enter valid password into the 'Password' field - <Refer Test Data>
  #5. Click on 'Login' button
  #6. Click on Browser back button (ER-1)

  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter valid email
    And I enter valid password

  Scenario:
    And I click on login button
    And  I should be Click on Browser back button
    Then User should not logout