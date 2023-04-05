package LiveProject06.MyStepPackage;

import DriverPackage.BasicDriver;
import LiveProject06.Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC_13Steps {
    DialogContent dc = new DialogContent();

    @Given("Click on My Account' Dropmenu")
    public void click_on_my_account_dropmenu() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("https://demo.opencart.com");
        BasicDriver.getDriver().manage().window().maximize();
        dc.clickMethod(dc.getMyAccountButton());
    }

    @When("Click on Log in option")
    public void click_on_log_in_option() {
        dc.clickMethod(dc.getLoginButtonUnderDropdown());
    }

    @Then("Enter any text into the Password field \\(ER-{int})")
    public void enter_any_text_into_the_password_field_er(Integer int1) {
        dc.sendKeysMethod(dc.getPassword(), "Sellom");

    }
}



