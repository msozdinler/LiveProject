Feature: Login Functionality
  Scenario: Validate logging into the Application using invalid credentials
    Given Click on my Account Dropmenu
    When Click in login option (Validate ER-1)
    And Enter invalid email address into the e-mail Address field <Refer Test Data>
    And  Enter invalid password into the Password field <Refers Test Data>
    Then Click on login button (Validate ER-1)