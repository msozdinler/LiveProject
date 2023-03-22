Feature: Register Functionality

  #  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
#  4.Click on 'No'  radio option for Newsletter
#  5. Click on 'Continue' button (ER-1)
#  6. Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)
#  7. Click on 'Subscribe/unsubscribe to newsletter' option (ER-3)


  Background:
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields

  Scenario: Validate Registering an Account when 'No' option is selected for Newsletter field

    And Click on the no button of NewsLetter
    And Click on the Continue button
    And Click on the Continue button that is displayed in the success page
    And click on the Newsletter
    Then user should see no button on newsletter is displayed
