package LiveProject05.pages;

import DriverPackage.BasicDriver;
import DriverPackage.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZhansuluPOM3 extends Methods {
    public ZhansuluPOM3(){
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
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
    private WebElement continueButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
    private WebElement successMessage;
    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegisterButton() {
        return RegisterButton;
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

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
