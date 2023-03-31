Feature: Login Functionality
  Scenario: Validate logging into the Application without using valid credentials
    Given click on My Account Dropmenu
    When click in Login OPTION (Validate ER-1)
    And don't Enter valid email address into the E-mail Address field <Refer Test Data>
    And don't Enter valid password into the Password field <Refer Test Data>
    Then click in Login options (Validate ER-1)