package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent2;
import io.cucumber.java.en.*;

public class TC_LF_005Steps {
    DialogContent2 dialogContent2 = new DialogContent2();
    @Given("click on My Account Dropmenu")
    public void click_on_my_account_dropmenu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
    }
    @When("click in Login OPTION \\(Validate ER{int})")
    public void clickInLoginOPTIONValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getAccountButton());
        dialogContent2.clickMethod(dialogContent2.getLoginButton());
    }

    @And("don't Enter valid email address into the E-mail Address field <Refer Test Data>")
    public void don_t_enter_valid_email_address_into_the_e_mail_address_field_refer_test_data() {
        dialogContent2.sendKeysMethod(dialogContent2.getEmailLogin(),"");

    }
    @And("don't Enter valid password into the Password field <Refer Test Data>")
    public void don_t_enter_valid_password_into_the_password_field_refer_test_data() {
        dialogContent2.sendKeysMethod(dialogContent2.getPassword(),"");

    }
    @Then("click in Login options \\(Validate ER{int})")
    public void clickInLoginOptionsValidateER(int arg0) {
        dialogContent2.clickMethod(dialogContent2.getLogin());
    }




}
