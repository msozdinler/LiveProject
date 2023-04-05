package LiveProject06.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_11_Pages {
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement MyAccountButton;

    public WebElement getMyAccountButton() {
        return MyAccountButton;
    }

    public WebElement getLoginButtonUnderDropdown() {
        return loginButtonUnderDropdown;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getConfirmLogin() {
        return confirmLogin;
    }

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    private WebElement loginButtonUnderDropdown;

    @FindBy(css = "#column-right > div > a:nth-child(1)")
    private WebElement loginButton;

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement confirmLogin;

}
