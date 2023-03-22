package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps_TC_06 {
    DialogContent dialogContent = new DialogContent();
    @Given("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Select on Register button")
    public void selectOnRegisterButton() {
        dialogContent.clickMethod(dialogContent.getRegisterButton());
    }

    @And("Enter new Account Fields")
    public void enterNewAccountFields() {
    }

    @And("Click on the no button of NewsLetter")
    public void clickOnTheNoButtonOfNewsLetter() {
    }

    @And("Click on the Continue button")
    public void clickOnTheContinueButton() {
    }

    @And("Click on the Continue button that is displayed in the success page")
    public void clickOnTheContinueButtonThatIsDisplayedInTheSuccessPage() {
    }

    @And("click on the Newsletter")
    public void clickOnTheNewsletter() {
        dialogContent.clickMethod(dialogContent.getNewsLetterNoButton());

    }

    @Then("user should see no button on newsletter is displayed")
    public void userShouldSeeNoButtonOnNewsletterIsDisplayed() {
    }
}
