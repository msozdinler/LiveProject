package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent;
import LiveProject06.Pages.DialogContent2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_LF_001Steps {
    DialogContent2 dialogContent2 = new DialogContent2();
    @Given("Click on My Account Dropmenu")
    public void clickOnMyAccountDropmenu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Click in Login option \\(Validate ER{int})")
    public void clickInLoginOptionValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getAccountButton());
        dialogContent2.clickMethod(dialogContent2.getLoginButton());

    }

    @And("Enter valid email address into the E-mail Address field <Refer Test Data>")
    public void enterValidEmailAddressIntoTheEMailAddressFieldReferTestData() {
        dialogContent2.sendKeysMethod(dialogContent2.getEmailLogin(),"pavanoltraining@gmail.com");

    }

    @And("Enter valid password into the Password field <Refer Test Data>")
    public void enterValidPasswordIntoThePasswordFieldReferTestData() {
        dialogContent2.sendKeysMethod(dialogContent2.getPassword(),"12345");
    }

    @Then("Click on Login button \\(Validate ER{int})")
    public void clickOnLoginButtonValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getLogin());
    }
}
