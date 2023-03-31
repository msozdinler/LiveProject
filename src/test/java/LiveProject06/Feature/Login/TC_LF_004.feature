Feature: Login Functionality
  Scenario: Validate logging into the Application using valid email address and invalid Password
    Given Click ON My Account Dropmenu
    When Click IN Login option (Validate ER-1)
    And Enter Valid email address into the E-mail Address field <Refer Test Data>
    And  Enter Invalid password into the Password field <Refer Test Data>
    Then Click ON Login button (Validate ER-2)