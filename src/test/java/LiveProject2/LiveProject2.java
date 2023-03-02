package LiveProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LiveProject2 {


    @Test
    void testBox(){

        /**TS-01 Validate the working of Test Box Functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demoqa.com/text-box");

        WebElement fullNameElement = driver.findElement(By.id("userName"));
        fullNameElement.click();
        fullNameElement.sendKeys("Automation");

        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Testing permanent Address");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();


    }

    @Test
    void checkBox() {

        /**TS-02 Validate the working of Check Box Functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

        WebElement ClickPlus = driver.findElement(By.cssSelector("button.rct-option-expand-all"));
        ClickPlus.click();

        WebElement checkedPublic = driver.findElement(By.cssSelector("label[for='tree-node-public']"));
        checkedPublic.click();

        WebElement checkedPrivate = driver.findElement(By.cssSelector("label[for='tree-node-private']"));
        checkedPrivate.click();

        WebElement unCheckedPublic = driver.findElement(By.cssSelector("label[for='tree-node-public']"));
        unCheckedPublic.click();

        WebElement unCheckedPrivate = driver.findElement(By.cssSelector("label[for='tree-node-private']"));
        unCheckedPrivate.click();

    }

        @Test
        void radioButton() {

        /**TS-03 Validate the working of Radio Button Functionality*/

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://demoqa.com/radio-button");

            WebElement clickAnswerButton = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
            clickAnswerButton.click();



    }
}
