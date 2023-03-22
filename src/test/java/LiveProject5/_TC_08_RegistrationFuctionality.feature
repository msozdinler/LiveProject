Feature: Register Functionality

  Scenario: Validate Registering an Account by entering
  different passwords into 'Password' and 'Password Confirm' fields

 Given Navigate to Opencart
 When Click on My Account Drop menu
 And Click on Register option
 When Enter new Account Details into all the Fields First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields
 And Enter any password say '12345' into the Password field
 And Enter any different password say '34546' into the Password Confirm field
 Then Click on Continue button


