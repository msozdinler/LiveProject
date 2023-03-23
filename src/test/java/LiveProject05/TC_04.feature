Feature: Register Functionality
  # 1.Click on 'My Account' Drop menu
  # 2. Click on 'Register' option
  # 3. Don't enter anything into the fields
  # 4. Click on 'Continue' button

  Scenario: TC-#4 Validate proper notification messages are displayed for the mandatory fields, when you don't provide any fields in the 'Register Account' page and submit
    Given I Navigate to My Account page
    When I Click on Register button
    Then I Click on Continue button
    Then I should see error message