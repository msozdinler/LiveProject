Feature: Login Functionality

  Scenario Outline: Validate logging into the Application using invalid email address and valid password
    Given Click on My Account Drop menu
    When Click in Login Option (Validate ER-<int1>)
    And Enter invalid email address into the E-mail Address field <Refer Test Data>
    And Enter valid password into the Password Field <Refer Test Data>
    Then Click On Login button (Validate ER-<int11>)
    Examples:
      | int1 | int11 |
      | 1    | 2     |