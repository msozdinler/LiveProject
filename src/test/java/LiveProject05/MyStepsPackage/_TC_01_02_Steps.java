package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.SYAGCIPOM_01_02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _TC_01_02_Steps {
    SYAGCIPOM_01_02 elements = new SYAGCIPOM_01_02();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    {
    }
    @Given("Navigate to OpenCart WepPage")
    public void navigateToOpenCartWepPage() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Click on My Account button.")
    public void clickOnMyAccountButton() {
       elements.clickMethod(elements.getMyAccButton());
    }

    @And("Click on Register button.")
    public void clickOnRegisterButton() {
        elements.clickMethod(elements.getRegisterButton());
    }

    @And("Enter new Account information")
    public void enterNewAccountInformation() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "Selim");
        elements.sendKeysMethod(elements.getLastNameInput(), "Yagci");
        elements.sendKeysMethod(elements.getEmailInput(), "Selimyagci1512@gmail.com");
        elements.waitUntilVisible(elements.getPhoneInput());
        elements.sendKeysMethod(elements.getPhoneInput(), "056478965412");
        elements.sendKeysMethod(elements.getPasswordButton(), "group9");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "group9");
        elements.clickMethod(elements.getCheckBox());
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        elements.clickMethod(elements.getContinueButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        elements.waitUntilVisible(elements.getSuccessMessage());
    }


    @When("Check the email address")
    public void checkTheEmailAddress() {

    }

    @Then("Click on the login page")
    public void clickOnTheLoginPage() {
    }
}
