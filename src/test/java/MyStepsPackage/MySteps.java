package MyStepsPackage;

import DriverPackage.BasicDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DialogContent;

public class MySteps {
    DialogContent dialogContent = new DialogContent();

    @Given("Navigate to Opencart")
    public void navigate_to_opencart() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }
    @When("Click on My Account Drop menu")
    public void click_on_my_account_drop_menu() {
    dialogContent.clickMethod(dialogContent.getMyAccButton());


    }
    @When("Click on Register option")
    public void click_on_register_option() {
        dialogContent.clickMethod(dialogContent.getRegisterButton());
    }
    @When("Click on Login option")
    public void click_on_login_option() {
        dialogContent.waitUntilClickable(dialogContent.getLoginButton());
        dialogContent.clickMethod(dialogContent.getLoginButton());


    }
    @When("Click  on Continue button inside New Customer box")
    public void click_on_continue_button_inside_new_customer_box() {
        dialogContent.waitUntilClickable(dialogContent.getContinueButton());
        dialogContent.clickMethod(dialogContent.getContinueButton());

    }
    @When("Repeat Steps three and four")
    public void repeat_steps_three_and_four() {

        dialogContent.waitUntilClickable(dialogContent.getLoginButton());
        dialogContent.clickMethod(dialogContent.getMyAccButton());
        dialogContent.waitUntilVisible(dialogContent.getLoginButton());
        dialogContent.clickMethod(dialogContent.getLoginButton());


    }
    @Then("Click on Register option from the Right Column options")
    public void click_on_register_option_from_the_right_column_options() {
        dialogContent.waitUntilClickable(dialogContent.getRegisterButton2());
        dialogContent.clickMethod(dialogContent.getRegisterButton2());

    }

}



