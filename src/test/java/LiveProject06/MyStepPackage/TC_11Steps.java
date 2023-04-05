package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_11Steps {
    DialogContent dc = new DialogContent();

    @Given("Click on 'My Account")
    public void click_on_my_account() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
        dc.clickMethod(dc.getMyAccountButton());
    }
    @When("Click on 'Login option")
    public void click_on_login_option() {
        dc.clickMethod(dc.getLoginButtonUnderDropdown());
    }
    @When("Enter valid email address")
    public void enter_valid_email_address() {
dc.sendKeysMethod(dc.getInputEmail(),"pavanoltraining@gmail.com");
    }
    @When("Enter valid password")
    public void enter_valid_password() {
dc.sendKeysMethod(dc.getPassword(),"12345");
    }
    @Then("Click on 'Login button \\(ER1)")
    public void click_on_login_button_er1() {
dc.clickMethod(dc.getConfirmLogin());
    }

}

