Feature: Login Functionality
#1. Click on 'My Account' Dropmenu
#2. Click on 'Login' option
#3. Press Tab keyboard key until the control comes to the E-Mail Address text field and enter the valid email address - <Refer Test Data>
#4. Press Tab keyboard key to move the control to Password text field and enter the valid password - <Refer Test Data>
#5. Press Tab keyboard key until the control comes 'Login' button and press 'Enter' key to submit (ER-1
 Background:
   Given I navigate to OpenCart web page
   When I go to login page
  Scenario:
   When I press tab keyboard until  valid email
    And I enter valid email
    And I press tab keyboard until password
    And I enter valid password
    And I press tab keyboard until Login button and press Enter
    Then I should be on  login  application