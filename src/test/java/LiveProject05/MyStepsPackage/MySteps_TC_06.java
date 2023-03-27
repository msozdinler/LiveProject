package LiveProject05.MyStepsPackage;

import DriverPackage.BasicDriver;
import LiveProject05.pages.DialogContent5;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps_TC_06 {
    DialogContent5 dialogContent = new DialogContent5();

    @Given("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Select on Register button")
    public void selectOnRegisterButton() {
       // dialogContent.clickMethod(dialogContent.getMyAccButton());
        dialogContent.clickMethod(dialogContent.getRegisterButton());

    }

    @And("Enter new Account Fields")
    public void enterNewAccountFields() {
//        dialogContent.getFirstNameInput().sendKeys("Mert");
//        dialogContent.getInputLastName().sendKeys("White");
//        dialogContent.getEmailInput().sendKeys("mertwhite@gmail.com");
//        dialogContent.getInputPhone().sendKeys("+13453213200");
//        dialogContent.getPassword().sendKeys("mert123");
//        dialogContent.getConfirmPasswordButton().sendKeys("mert123");

        dialogContent.sendKeysMethod(dialogContent.getInputName(), "Justin");
        dialogContent.sendKeysMethod(dialogContent.getInputLastName(), "White");
        dialogContent.sendKeysMethod(dialogContent.getInputEmail(), "justinw@gmail.com");
        dialogContent.sendKeysMethod(dialogContent.getInputPhone(), "99645373231");
    }

    @And("Click on the no button of NewsLetter")
    public void clickOnTheNoButtonOfNewsLetter() {
        dialogContent.getNewsLetterNoButton().click();
    }

    @And("Click on the Continue button")
    public void clickOnTheContinueButton() {
        dialogContent.getContinueButton().click();
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
