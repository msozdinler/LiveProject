package LiveProject05.pages;

import DriverPackage.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SYAGCIPOM_01_02 extends Methods {

    @FindBy(css = "a[class='dropdown-toggle']")
    private WebElement myAccButton;
    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
    private WebElement registerButton;

    @FindBy(css = "#column-right > div > a:nth-child(1)")
    private WebElement loginButton;
    //<a href="https://opencart.abstracta.us:443/index.php?route=account/login">Login</a>
    @FindBy(css = "#content > div > div:nth-child(1) > div > a")
    private WebElement continueButton;
    //<a href="https://opencart.abstracta.us:443/index.php?route=account/register" class="btn btn-primary">Continue</a>


    @FindBy(xpath = "//*[@id='column-right']/div/a[2]")
    private WebElement registerButton2;
    //<a href="https://opencart.abstracta.us:443/index.php?route=account/register" class="list-group-item">Register</a>
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement RegisterButton;

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement phoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordButton;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBox;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement contineButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
    private WebElement successMessage;

    public WebElement getMyAccButton() {
        return myAccButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getPasswordButton() {
        return passwordButton;
    }

    public WebElement getConfirmPasswordButton() {
        return confirmPasswordButton;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getContineButton() {
        return contineButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getRegisterButton2() {
        return registerButton2;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }
}
