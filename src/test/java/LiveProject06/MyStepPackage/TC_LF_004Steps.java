package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent2;
import io.cucumber.java.en.*;

public class TC_LF_004Steps {
    DialogContent2 dialogContent2 = new DialogContent2();
    @Given("Click ON My Account Dropmenu")
    public void click_on_my_account_dropmenu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();

    }
    @When("Click IN Login option \\(Validate ER-{int})")
    public void click_in_login_option_validate_er(Integer int1) {
        dialogContent2.clickMethod(dialogContent2.getAccountButton());
        dialogContent2.clickMethod(dialogContent2.getLoginButton());

    }
    @And("Enter Valid email address into the E-mail Address field <Refer Test Data>")
    public void enter_valid_email_address_into_the_e_mail_address_field_refer_test_data() {
        dialogContent2.sendKeysMethod(dialogContent2.getEmailLogin(),"pavanoltraining@gmail.com");

    }
    @And("Enter Invalid password into the Password field <Refer Test Data>")
    public void enter_invalid_password_into_the_password_field_refer_test_data() {
        dialogContent2.sendKeysMethod(dialogContent2.getPassword(),"myzabo123");

    }
    @Then("Click ON Login button \\(Validate ER-{int})")
    public void click_on_login_button_validate_er(Integer int1) {
        dialogContent2.clickMethod(dialogContent2.getLogin());

    }
}
