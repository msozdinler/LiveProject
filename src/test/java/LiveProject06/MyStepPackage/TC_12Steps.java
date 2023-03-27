package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class TC_12Steps {
    DialogContent dc = new DialogContent();

    @Given("Click on the My Account")
    public void clickOnTheMyAccount() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
        dc.clickMethod(dc.getMyAccountButton());
    }

    @When("Click on the Login option")
    public void clickOnTheLoginOption() {
        dc.clickMethod(dc.getLoginButtonUnderDropdown());
    }

    @And("Enter valid email address into")
    public void enterValidEmailAddressInto() {
        dc.sendKeysMethod(dc.getInputEmail(), "xyzabc123@gmail.com");
    }

    @And("Enter valid password into")
    public void enterValidPasswordInto() {
        dc.sendKeysMethod(dc.getPassword(), "xyzabc123");

    }

    @And("Click on the Login button \\(ER{int})")
    public void clickOnTheLoginButtonER(int arg0) {
        dc.clickMethod(dc.getConfirmLogin());
    }

    @Then("Repeat Step {int} for {int} more times \\(ER{int})")
    public void repeatStepForMoreTimesER(int arg0, int arg1, int arg2) {
        List<String> loginButton = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dc.clickMethod(dc.getConfirmLogin());

        }

    }
}