Feature: Login Functionality
  Scenario: Validate logging into the Application using valid credentials
    Given Click on My Account Dropmenu
    When Click in Login option (Validate ER-1)
    And Enter valid email address into the E-mail Address field <Refer Test Data>
    And  Enter valid password into the Password field <Refer Test Data>
    Then Click on Login button (Validate ER-2)