package DriverPackage;

import DriverPackage.BasicDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyMethods {


    // all methods here
    // click ,scroll , wait method , send keys method
    //we will use object inside this class only

    WebDriverWait wait= new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(30));   // since is static we call by name of metod

    public void sendKeysMethod(WebElement element, String value){       //web element with some name
        wait.until(ExpectedConditions.visibilityOf(element));           //second one options
        element.sendKeys(value);

    }
    public void clickMethod(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void scrollMethod(WebElement element){                           //integer ofset ??
        // wait.until(ExpectedConditions.visibilityOf(element));             // do not work with this metod below
        JavascriptExecutor js = (JavascriptExecutor) BasicDriver.getDriver();   //scroll down untill visible
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public String  getTextMethod(WebElement element){      //contains metod we need value ?
        wait.until(ExpectedConditions.visibilityOf(element));
        //element.getText();  //we did on below


        return element.getText();
    }
    public void wait(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


}
}
