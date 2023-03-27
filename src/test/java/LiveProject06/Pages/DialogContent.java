package LiveProject06.Pages;

import DriverPackage.BasicDriver;
import DriverPackage.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Methods {

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

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
    private WebElement continue1Button;

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
    @FindBy(id = "input-firstname")
    private WebElement inputName;

//<input type="text" name="firstname" value="" placeholder="First Name" id="input-firstname" class="form-control">

    @FindBy(id = "input-lastname")
    private WebElement inputLastName;
    //<input type="text" name="lastname" value="" placeholder="Last Name" id="input-lastname" class="form-control">

    @FindBy(id = "input-email")
    private WebElement inputEmail;
    //<input type="email" name="email" value="" placeholder="E-Mail" id="input-email" class="form-control">
    @FindBy(id = "input-telephone")
    private WebElement inputPhone;
    //<input type="tel" name="telephone" value="" placeholder="Telephone" id="input-telephone" class="form-control">

    @FindBy(id = "input-password")
    private WebElement password;

    //<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
    @FindBy(id = "input-confirm")
    private WebElement confirm;
    //<input type="password" name="confirm" value="" placeholder="Password Confirm" id="input-confirm" class="form-control">

    @FindBy(css = "input[class='btn btn-primary']")
    private WebElement confirmRegistration;
    //<input type="submit" value="Continue" class="btn btn-primary">

    public WebElement getConfirmLogin() {
        return confirmLogin;
    }

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement confirmLogin;

    public WebElement getMyAccountButton() {
        return MyAccountButton;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirm() {
        return confirm;
    }

    public WebElement getConfirmRegistration() {
        return confirmRegistration;
    }

    public WebElement getRegisterButton2() {
        return registerButton2;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getMyAccButton() {
        return myAccButton;
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

    public WebElement getContinue1Button() {
        return continue1Button;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getContinue2Button() {
        return continue2Button;
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

    public WebElement getPhoneNumErrorMessage() {
        return phoneNumErrorMessage;
    }

    public WebElement getPrivacyErrorMessage() {
        return privacyErrorMessage;
    }

    public WebElement getNewsLetterYesButton() {
        return newsLetterYesButton;
    }

    public WebElement getNewsLetterButton() {
        return newsLetterButton;
    }

    public WebElement getNewsLetterNoButton() {
        return newsLetterNoButton;
    }

    public WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public WebElement getMyAccountHeader() {
        return MyAccountHeader;
    }

    public WebElement getContinueButtonInNewCustomerBox() {
        return continueButtonInNewCustomerBox;
    }


    public WebElement getLoginButtonUnderDropdown() {
        return loginButtonUnderDropdown;
    }

    public WebElement getRegisterOnTheColumn() {
        return registerOnTheColumn;
    }

    public WebElement getRegisterAccountPage() {
        return registerAccountPage;
    }

    public WebElement getPasswordNotMatch() {
        return PasswordNotMatch;
    }

    public WebElement getUsedEmailErrorMessage() {
        return usedEmailErrorMessage;
    }
}


