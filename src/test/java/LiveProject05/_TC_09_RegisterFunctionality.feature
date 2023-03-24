Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter existing Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) - <Refer Test Data>
#  4. Click on 'Continue' button (ER-1)

  Scenario: Validate Registering an Account by providing the existing account details (i.e. existing email address)
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields with given data
    And Click on the Continue button
    Then user should see the error email message top of the page
