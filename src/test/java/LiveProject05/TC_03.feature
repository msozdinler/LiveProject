Feature: Register Functionality
#1. Click on 'My Account' Drop menu
#2. Click on 'Register' option
#3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields)
#4. Click on 'Continue' button (ER-1)
#5. Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)
  Scenario: TC-#3 Validate Registering an Account by providing all the fields

    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account   Fields
    And Click on the Continue button
    Then User should register successfully