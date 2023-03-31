Feature: Login to the OpenChart web application
   #Open the Application URL - https://demo.opencart.com
  # EmailAddress - pavanoltraining@gmail.com
  # Password - 12345
  # TC#6 Click on 'My Account' Dropmenu
  #2. Click on 'Login' option (ER-1)
  #3. Click on 'Forgotten Password' link (ER-2)
  Scenario: Validate Forgotten  Password
    Given I navigate to OpenCart web page
    When I go to login page
    Then I click on Forgotten Password
    Then I should be taken to the Forgotten Password


