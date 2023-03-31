package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent2;
import io.cucumber.java.en.*;

public class TC_LF_003Steps {
    DialogContent2 dialogContent2 = new DialogContent2();
    @Given("Click on My Account Drop menu")
    public void click_On_My_Account_Drop_menu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();

    }
    @When("Click in Login Option \\(Validate ER-{int})")
    public void click_in_login_option_validate_er(Integer int1) {
        dialogContent2.clickMethod(dialogContent2.getAccountButton());
        dialogContent2.clickMethod(dialogContent2.getLoginButton());

    }
    @And("Enter invalid email address into the E-mail Address field <Refer Test Data>")
    public void enter_invalid_email_address_into_the_e_mail_address_field_refer_test_data() {

        dialogContent2.sendKeysMethod(dialogContent2.getEmailLogin(),"myzabo123@gmail.com");
    }
    @And("Enter valid password into the Password Field <Refer Test Data>")
    public void enter_valid_password_into_the_password_field_refer_test_data() {
        dialogContent2.sendKeysMethod(dialogContent2.getPassword(),"12345");

    }
    @Then("Click On Login button \\(Validate ER-{int})")
    public void click_on_login_button_validate_er(Integer int1) {
        dialogContent2.clickMethod(dialogContent2.getLogin());

    }



}
