package LiveProject06.Pages;

import DriverPackage.BasicDriver;
import DriverPackage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent2 extends MyMethods {


    public DialogContent2 () {

        PageFactory.initElements(BasicDriver.getDriver(),this);

    }

    public WebElement getAccountButton() {
        return accountButton;
    }

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
    private WebElement accountButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")
    private WebElement loginButton;

    public WebElement getEmailLogin() {
        return emailLogin;
    }

    @FindBy (xpath = "//*[@id=\"input-email\"]")
    private WebElement emailLogin;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(id = "input-password")
            private WebElement password;

    public WebElement getLogin() {
        return login;
    }

    @FindBy(xpath = "//*[@id=\"form-login\"]/button")
    private WebElement login;

}
