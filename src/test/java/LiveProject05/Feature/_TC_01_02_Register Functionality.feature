Feature: Register Functionality

  Scenario: Validate Registering
    Given Navigate to OpenCart WepPage
    When Click on My Account button.
    And Click on Register button.
    And Enter new Account information
    And Click on Continue button
    Then Success message should be displayed
    #  Test Case 01_Steps(Validate Registering an Account by providing only the Mandatory fields)
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
#  4. Click on 'Continue' button (ER-1)
#  5. Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)

  Scenario: Register Functionality
    Given Navigate to OpenCart WepPage
    When Click on My Account button.
    And Click on Register button.
    And Enter new Account information
    And Click on Continue button
    And Check email address  (BUG)
    Then Click the link from email.(BUG)
#  Test Case 02_Steps(Validate 'Thank you for registering' email is sent to the registered email address as a confirmation for registering the account
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
#  4. Click on 'Continue' button
# (BUG)  5. Check the email address used for registering the account (Verify ER-1, ER-2. ER-3)
#  (BUG) 6. Click on the Login page link from the Email body (Verify ER-4)



















