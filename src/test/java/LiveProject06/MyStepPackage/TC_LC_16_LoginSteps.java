package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/LiveProject06/Feature.Login"},
        glue = {"MyStepPackage"}
)
public class TC_LC_16_LoginSteps {
    DialogContent dc6 = new DialogContent();


    @Given("Click on 'My Account' Dropmenu")
    public void clickOnMyAccountDropmenu()throws Exception {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
        dc6.clickMethod(dc6.getMyAccButton());
        //dc6.getMyAccButton().click();

    }


    @When("Click on 'Login' option \\(Validate ER-1)")
    public void clickOnLoginOptionValidateER(int arg0) {
        dc6.waitUntilClickable(dc6.getLoginButton());
        dc6.clickMethod(dc6.getLoginButton());
    }

    @And("Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>")
    public void enterValidEmailAddressIntoTheEMailAddressFieldReferTestData() {

        /** #EmailAddress - pavanoltraining@gmail.com
            #Password - 12345 */

        dc6.sendKeysMethod(dc6.getInputEmail(),"pavanoltraining@gmail.com");
        dc6.sendKeysMethod(dc6.getPassword(),"12345");
//        dc6.getInputEmail().sendKeys("pavanoltraining@gmail.com");
//        dc6.getPassword().sendKeys("12345");
//        dc6.getLoginButton().click();
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

    @Then("Enter new credentials given in Step 7 and click on 'Login' button \\(ER-2)\"")
    public void enterNewCredentialsGivenInStepAndClickOnLoginButtonER(int arg0, int arg1) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}