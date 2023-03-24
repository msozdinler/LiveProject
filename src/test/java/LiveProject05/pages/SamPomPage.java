package LiveProject05.pages;

import DriverPackage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamPomPage extends MyMethods {
    public void SamPomPage() {
        PageFactory.initElements(DriverPackage.BasicDriver1.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement MyAccountButton;

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

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continue2Button;

    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    private WebElement FirstNameErrorMessage;

    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    private WebElement LastNameErrorMessage;

    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    private WebElement emailErrorMessage;

    @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
    private WebElement phoneNumErrorMessage;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement privacyErrorMessage;


    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement newsLetterYesButton;

    @FindBy(linkText = "Newsletter")
    private WebElement newsLetterButton;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement newsLetterNoButton;

    @FindBy(xpath = "(//div[@class='text-danger'])[5]")
    private WebElement passwordErrorMessage;

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement MyAccountHeader;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueButtonInNewCustomerBox;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    private WebElement loginButtonUnderDropdown;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerOnTheColumn;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerAccountPage;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement PasswordNotMatch;
    @FindBy(css = "div[class='alert alert-danger alert-dismissible']")
    private WebElement usedEmailErrorMessage;

    @FindBy(xpath = "//h1[text()='Account']")
    private WebElement AccountSuccess;
    public WebElement getUsedEmailErrorMessage() {
        return usedEmailErrorMessage;
    }

    public WebElement getPasswordNotMatch() {
        return PasswordNotMatch;
    }

    public WebElement getRegisterAccountPage() {
        return registerAccountPage;
    }

    public WebElement getRegisterOnTheColumn() {
        return registerOnTheColumn;
    }

    public WebElement getLoginButtonUnderDropdown() {
        return loginButtonUnderDropdown;
    }

    public WebElement getContinueButtonInNewCustomerBox() {
        return continueButtonInNewCustomerBox;
    }

    public WebElement getNewsLetterYesButton() {
        return newsLetterYesButton;
    }

    public WebElement getNewsLetterButton() {
        return newsLetterButton;
    }public WebElement getNewsLetterNoButton() {
        return newsLetterNoButton;
    }

    public WebElement getPrivacyErrorMessage() {
        return privacyErrorMessage;
    }

    public WebElement getFirstNameErrorMessage() {
        return FirstNameErrorMessage;
    }

    public WebElement getLastNameErrorMessage() {
        return LastNameErrorMessage;
    }

    public WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public WebElement getMyAccountHeader() {
        return MyAccountHeader;
    }

    public WebElement getContinue2Button() {
        return continue2Button;
    }

    public WebElement getMyAccountButton() {
        return MyAccountButton;
    }

    public WebElement getRegisterButton() {
        return RegisterButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
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

    public WebElement getPhoneNumErrorMessage() {
        return phoneNumErrorMessage;
    }}