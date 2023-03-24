package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _TC_01_02_Steps {
    DialogContent dialogContent = new DialogContent();

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
        dialogContent.clickMethod(dialogContent.getMyAccButton());
    }

    @And("Click on Register button.")
    public void clickOnRegisterButton() {
        dialogContent.clickMethod(dialogContent.getRegisterButton());
    }

    @And("Enter new Account information")
    public void enterNewAccountInformation() {
        dialogContent.sendKeysMethod(dialogContent.getFirstname(), "Selim");
        dialogContent.sendKeysMethod(dialogContent.getLastname(), "Yagci");
        dialogContent.sendKeysMethod(dialogContent.getEmail(), "Selimyagci1512@gmail.com");
        dialogContent.waitUntilVisible(dialogContent.getTelephone());
        dialogContent.sendKeysMethod(dialogContent.getTelephone(), "056478965412");
        dialogContent.sendKeysMethod(dialogContent.getPassword(), "group9");
        dialogContent.sendKeysMethod(dialogContent.getPasswordConfirm(), "group9");
        dialogContent.clickMethod(dialogContent.getAgree());
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        dialogContent.clickMethod(dialogContent.getContinueClick());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContent.waitUntilVisible(dialogContent.getSuccessMessage());
    }


    @When("Check the email address")
    public void checkTheEmailAddress() {

    }

    @Then("Click on the login page")
    public void clickOnTheLoginPage() {
    }
}
