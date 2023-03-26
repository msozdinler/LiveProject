Feature: Login Functionality

  Scenario:
    Given Click on 'My Account' Dropmenu
    When Click on 'Login' option (Validate ER-1)
    And Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>
    And Enter valid password into the 'Password' field - <Refer Test Data>
    When Click on 'Login' button
    And Click on 'Change your password' link
    And Enter new password into the 'Password' and 'Password Confirm' fields
    And Click on 'Continue' button
    When Click on 'My Account' Dropmenu and select 'Logout' option
    And Repeat steps 1 to 5 (ER-1)
    Then Enter new credentials given in Step 7 and click on 'Login' button (ER-2)"