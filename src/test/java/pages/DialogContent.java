package pages;

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

    public WebElement getConfirmRegistration() {
        return confirmRegistration;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirm() {
        return confirm;
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
    }}