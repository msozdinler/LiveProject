package MyStepsPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DialogContent;

public class _08_MyStepdefs {

    DialogContent dialogContent = new DialogContent();
    @When("Enter new Account Details into all the Fields First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields")
    public void enterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephoneNewsletterAndPrivacyPolicyFields() {
       dialogContent.sendKeysMethod(dialogContent.getInputName(), "Selena");
       dialogContent.sendKeysMethod(dialogContent.getInputLastName(), "Gomez");
       dialogContent.sendKeysMethod(dialogContent.getInputEmail(), "selenag@gmail.com");
       dialogContent.sendKeysMethod(dialogContent.getInputPhone(), "99645373737488");

    }

    @And("Enter any password say {string} into the Password field")
    public void enterAnyPasswordSayIntoThePasswordField(String password) {
        dialogContent.sendKeysMethod(dialogContent.getPassword(), password);
    }

    @And("Enter any different password say {string} into the Password Confirm field")
    public void enterAnyDifferentPasswordSayIntoThePasswordConfirmField(String incorrectPassword) {
        dialogContent.sendKeysMethod(dialogContent.getPassword(), incorrectPassword);
    }

    @Then("Click on Continue button")
    public void clickOnContinueButton() {
        dialogContent.clickMethod(dialogContent.getConfirmRegistration());
    }

}
