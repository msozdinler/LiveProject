Feature: Login Functionality
#1. Click on 'My Account' Dropmenu
#2. Click on 'Login' option
#3. Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>
#4. Enter valid password into the 'Password' field - <Refer Test Data>
#5. Click on 'Login' button
#6. Click on 'My Account' Dropmenu and select 'Logout' option
#7. Click on Browser back button (ER-1)
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter valid email
    And I enter valid password
    And I click on login button
  Scenario: Validate Log out from the Application and browsing back using Browser back button
   And Click on My Account and select Logout option
    And  I should be Click on Browser back button
    Then User should not get log in again
