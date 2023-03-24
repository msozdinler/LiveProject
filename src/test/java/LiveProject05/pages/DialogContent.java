package LiveProject05.pages;

import DriverPackage.BasicDriver;
import DriverPackage.Methods;
import org.openqa.selenium.By;
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

    @FindBy(id="input-firstname")
    private WebElement firstname;

    @FindBy(id="input-lastname")
    private WebElement lastname ;


    @FindBy(id="input-email")
    private WebElement email ;

    @FindBy(id="input-telephone")
    private WebElement telephone ;


    @FindBy(id="input-password")
    private WebElement password  ;

    @FindBy(id="input-confirm")
    private WebElement passwordConfirm  ;

    @FindBy(name="agree")
    private WebElement agree  ;

    @FindBy(css= "input[value='Continue']")
    private WebElement continueClick;

    @FindBy(xpath="//div[@id='content']//p")
    private WebElement successMessage;


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

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getTelephone() {
        return telephone;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getPasswordConfirm() {
        return passwordConfirm;
    }

    public WebElement getAgree() {
        return agree;
    }

    public WebElement getMyAccButton() {
        return myAccButton;
    }

    public WebElement getContinueClick() {
        return continueClick;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}