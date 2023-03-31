package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_LF_002Steps {
    DialogContent2 dialogContent2 = new DialogContent2();

    @Given("Click on my Account Dropmenu")
    public void clickOnMyAccountDropmenu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();

    }

    @When("Click in login option \\(Validate ER{int})")
    public void clickInLoginOptionValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getAccountButton());
        dialogContent2.clickMethod(dialogContent2.getLoginButton());
    }

    @And("Enter invalid email address into the e-mail Address field <Refer Test Data>")
    public void enterInvalidEmailAddressIntoTheEMailAddressFieldReferTestData() {
        dialogContent2.sendKeysMethod(dialogContent2.getEmailLogin(),"emailInvalid@gmail.com");
    }

    @And("Enter invalid password into the Password field <Refers Test Data>")
    public void enterInvalidPasswordIntoThePasswordFieldRefersTestData() {
        dialogContent2.sendKeysMethod(dialogContent2.getPassword(),"123456");
    }

    @Then("Click on login button \\(Validate ER{int})")
    public void clickOnLoginButtonValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getLogin());
    }
}
