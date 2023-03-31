package LiveProject06.MyStepDefinitionsPackage;

import DriverPackage.BasicDriver;
import DriverPackage.BasicDriver1;
import LiveProject06.Pages.SuluPOM6;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SuluSteps6 {
    SuluPOM6 sp = new SuluPOM6();
    WebDriverWait wait = new WebDriverWait(BasicDriver1.getDriver(), Duration.ofSeconds(10));

    @Given("I navigate to OpenCart web page")
    public void iNavigateToOpenCartWebPage() {
        BasicDriver1.getDriver().get("https://opencart.abstracta.us/");
        // BasicDriver.getDriver().manage().deleteAllCookies();
        BasicDriver1.getDriver().manage().window().maximize();

    }

    @When("I go to login page")
    public void iGoToLoginPage() {
        sp.clickMethod(sp.getMyAccount());
        sp.clickMethod(sp.getLoginUnderMyAccount());
    }

    @Then("I click on Forgotten Password")
    public void iClickOnForgottenPassword() {
        sp.clickMethod(sp.getForgottenPassword());
    }
    @Then("I should be taken to the Forgotten Password")
    public void iShouldBeTakenToTheForgottenPassword() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sp.getForgottenPassword().getText().contains("Click submit to have a password reset link e-mailed to you."));
    }
// Test Case #7 by Zhansulu
    /**
     * WebElement targetElement = driver.findElement(By.xpath("//input[@name='target_input']"));
     * while (!driver.switchTo().activeElement().equals(targetElement)) {
     * driver.switchTo().activeElement().sendKeys(Keys.TAB);
     * WebDriverWait wait = new WebDriverWait(driver, 10);
     * wait.until(ExpectedConditions.visibilityOf(targetElement));
     * }
     * targetElement.sendKeys("some text");
     */
    @When("I press tab keyboard until  valid email")
    public void iPressTabKeyboardUntilValidEmail() {
        sp.getEmailField();
        while (!BasicDriver1.getDriver().switchTo().activeElement().equals(sp.getEmailField())) {
            BasicDriver1.getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
            wait.until(ExpectedConditions.visibilityOf(sp.getEmailField()));
        }
    }

    @And("I enter valid email")
    public void iEnterValidEmail() {
        sp.sendKeysMethod(sp.getEmailField(), "testersdet@test.com");// change email
    }

    @And("I press tab keyboard until password")
    public void iPressTabKeyboardUntilPassword() {
        sp.getPasswordField();
        while (!BasicDriver1.getDriver().switchTo().activeElement().equals(sp.getPasswordField())) {
            BasicDriver1.getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
            wait.until(ExpectedConditions.visibilityOf(sp.getPasswordField()));
        }
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        sp.sendKeysMethod(sp.getPasswordField(), "12345");
    }

    @And("I press tab keyboard until Login button and press Enter")
    public void iPressTabKeyboardUntilLoginButtonAndPressEnter() {
        sp.getLoginButton();
        while (!BasicDriver1.getDriver().switchTo().activeElement().equals(sp.getLoginButton())) {
            BasicDriver1.getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
            wait.until(ExpectedConditions.visibilityOf(sp.getLoginButton()));
        }
        sp.getLoginButton().click();
    }
        @Then("I should be on  login  application")
        public void iShouldBeOnLoginApplication() {
            Assert.assertEquals(BasicDriver1.getDriver().getTitle(),"My Account");
        }
// Test Case #8
    /**
    #1. Click on 'My Account' Dropmenu
    #2. Click on 'Login' option (ER-1)
     */
    @Then("I should be see login and password fields")
    public void iShouldBeSeeLoginAndPasswordFields() {
        Assert.assertEquals(BasicDriver1.getDriver().getTitle(),"Account Login");
    }
    @And("I click on login button")
    public void iClickOnLoginButton() {
        sp.clickMethod(sp.getLoginButton());
    }

    @And("I should be Click on Browser back button")
    public void iShouldBeClickOnBrowserBackButton() {
        BasicDriver1.getDriver().navigate().back();

    }

    @Then("User should not logout")
    public void userShouldNotLogout() {
        Assert.assertTrue(sp.getReturnMs().isDisplayed(),"");
    }

// Test Case #10 by

    @And("Click on My Account and select Logout option")
    public void clickOnMyAccountAndSelectLogoutOption() {
        sp.clickMethod(sp.getMyAccount());
        sp.clickMethod(sp.getLogOut());
    }
    @Then("User should not get log in again")
    public void userShouldNotGetLogInAgain() throws InterruptedException {
        sp.clickMethod(sp.getMyAccount());
        Thread.sleep(3000);
        Assert.assertTrue(sp.getLogOut().isDisplayed());
    }
}


