Feature: Register Functionality

  Scenario: Validate different ways of navigating to 'Register Account' page

 Given Navigate to Opencart
 When Click on My Account Drop menu
 And Click on Register option
 When Click on My Account Drop menu
 And Click on Login option
 When Click  on Continue button inside New Customer box
 And Repeat Steps three and four
 Then Click on Register option from the Right Column options