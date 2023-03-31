package LiveProject06.Pages;

import DriverPackage.BasicDriver;
import DriverPackage.BasicDriver1;
import DriverPackage.Methods;
import DriverPackage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SuluPOM6 extends MyMethods{
     public SuluPOM6() {
          PageFactory.initElements(BasicDriver1.getDriver(), this);
     }
     @FindBy(xpath = "//span[text()='My Account']")
     private WebElement myAccount;

     @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Login']")
     private WebElement loginUnderMyAccount;

     @FindBy(xpath = "//a[text()='Forgotten Password']")
     private WebElement forgottenPassword;

     @FindBy(xpath = "//*[@id=\"content\"]/p")
     private WebElement askMes;

     @FindBy(id = "input-email")
     private WebElement emailField;

     @FindBy(id = "input-password")
     private WebElement passwordField;

     @FindBy(css = "input[type='submit']")
     private WebElement loginButton;

     @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/h2")
     private WebElement returnMs;

     @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    private WebElement logOut;
     public WebElement getMyAccount() {
          return myAccount;
     }

     public WebElement getLoginUnderMyAccount() {
          return loginUnderMyAccount;
     }

     public WebElement getForgottenPassword() {
          return forgottenPassword;

     }

     public WebElement getAskMes() {
          return askMes;
     }

     public WebElement getEmailField() {
          return emailField;
     }

     public WebElement getPasswordField() {
          return passwordField;
     }

     public WebElement getLoginButton() {
          return loginButton;
     }

     public WebElement getReturnMs() {
          return returnMs;
     }

     public WebElement getLogOut() {
          return logOut;
     }
}
