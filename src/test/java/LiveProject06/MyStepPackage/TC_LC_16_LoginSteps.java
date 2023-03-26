package LiveProject06.MyStepPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_LC_16_LoginSteps {
    @Given("Click on 'My Account' Dropmenu")
    public void clickOnMyAccountDropmenu() {
    }

    @When("Click on 'Login' option \\(Validate ER-1)")
    public void clickOnLoginOptionValidateER(int arg0) {
    }

    @And("Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>")
    public void enterValidEmailAddressIntoTheEMailAddressFieldReferTestData() {
    }

    @And("Enter valid password into the 'Password' field - <Refer Test Data>")
    public void enterValidPasswordIntoThePasswordFieldReferTestData() {
    }

    @When("Click on 'Login' button")
    public void clickOnLoginButton() {
    }

    @And("Click on 'Change your password' link")
    public void clickOnChangeYourPasswordLink() {
    }

    @And("Enter new password into the 'Password' and 'Password Confirm' fields")
    public void enterNewPasswordIntoThePasswordAndPasswordConfirmFields() {
    }

    @And("Click on 'Continue' button")
    public void clickOnContinueButton() {
    }

    @When("Click on 'My Account' Dropmenu and select 'Logout' option")
    public void clickOnMyAccountDropmenuAndSelectLogoutOption() {
    }

    @And("Repeat steps 1 to 5 \\(ER-1)")
    public void repeatStepsToER(int arg0, int arg1, int arg2) {
    }

    @Then("Enter new credentials given in Step 7 and click on {string} button \\(ER-2)\"")
    public void enterNewCredentialsGivenInStepAndClickOnLoginButtonER(int arg0, int arg1) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}