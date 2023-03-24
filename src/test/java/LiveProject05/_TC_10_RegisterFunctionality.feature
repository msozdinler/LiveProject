Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields)
#  4. Enter invalid email address into the E-Mail Field - <Refer Test Data>
#  5. Click on 'Continue' button (ER-1)
#  1) pavanol
#  2) pavanol@
#  3) pavanol@gmail
#  4) pavanol@gmail.com


  Scenario Outline: Validate Registering an Account by providing an invalid email address into the E-Mail field
    Given Navigate to My Account page
    When Select on Register button
    And Enter all wanted places
    And Enter invalid "<email>" address
    And Click on the Continue button
    Then user should see the error message for email
    Examples:
      | email             |
      | pavanol           |
      | pavanol@          |
      | pavanol@gmail     |
      | pavanol@gmail.com|