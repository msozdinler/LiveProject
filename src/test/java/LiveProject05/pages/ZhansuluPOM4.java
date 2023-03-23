package LiveProject05.pages;

import DriverPackage.BasicDriver;
import DriverPackage.Methods;
import com.sun.jdi.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZhansuluPOM4 extends Methods {
    public ZhansuluPOM4(){
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement RegisterButton;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(),' Warning: You must agree to the Privacy Policy!')]")
    private WebElement errorMsgMustAgreePolicy;
    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegisterButton() {
        return RegisterButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getErrorMsgMustAgreePolicy() {
        return errorMsgMustAgreePolicy;
    }





}
