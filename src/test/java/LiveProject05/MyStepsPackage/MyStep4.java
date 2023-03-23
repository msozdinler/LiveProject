package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.ZhansuluPOM3;
import LiveProject05.pages.ZhansuluPOM4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStep4 {
    ZhansuluPOM4 elements = new ZhansuluPOM4();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));
    @Given("I Navigate to My Account page")
    public void iNavigateToMyAccountPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        elements.clickMethod(elements.getMyAccount());
    }

    @When("I Click on Register button")
    public void iClickOnRegisterButton() {
        elements.clickMethod(elements.getRegisterButton());
    }

    @Then("I Click on Continue button")
    public void iClickOnContinueButton() {
        elements.clickMethod(elements.getContinueButton());
    }

    @Then("I should see error message")
    public void iShouldSeeErrorMessage() {
        Assert.assertTrue(elements.getErrorMsgMustAgreePolicy().isDisplayed(),"Test is Failed");
    }
}
