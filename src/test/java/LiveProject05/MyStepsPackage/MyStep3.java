package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.ZhansuluPOM3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStep3 {
    ZhansuluPOM3 elements = new ZhansuluPOM3();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        elements.clickMethod(elements.getMyAccount());
    }

    @When("Select on Register button")
    public void selectOnRegisterButton() {
        elements.clickMethod(elements.getRegisterButton());
    }

    @And("Enter new Account   Fields")
    public void enterNewAccountFields() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "Zhansulu");
        elements.sendKeysMethod(elements.getLastNameInput(),"Sarvalova");
        elements.sendKeysMethod(elements.getEmailInput(), "camp@te.ru");
        elements.sendKeysMethod(elements.getPhoneInput(), "9919910000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Sulu123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Sulu123");
        elements.clickMethod(elements.getCheckBox());
    }

    @And("Click on the Continue button")
    public void clickOnTheContinueButton() {
        elements.clickMethod(elements.getContinueButton());
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertEquals(elements.getSuccessMessage().getText(),"Congratulations! Your new account has been successfully created!");
    }
}