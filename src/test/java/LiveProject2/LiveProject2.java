package LiveProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class LiveProject2 {


    @Test
    void testBox() {

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

    @Test
    void selectMenu() throws InterruptedException {
        /**ID-12 Validate selecting drop down functionalities  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu/");


    }
    @Test
    void SliderDemo() throws InterruptedException {
        /**ID-02 Validate the working of interaction button functionality*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/slider/");

        WebElement slider = driver.findElement(By.className("range-slider__wrap"));

        int sliderWidth = slider.getSize().getWidth();

        Actions move = new Actions(driver);
        move.moveToElement(slider)
                .clickAndHold()
                .moveByOffset((int) (sliderWidth * 0.3), 0)
                .release()
                .perform();

        Thread.sleep(3000);
    }
    @Test
    void multipleSelectable(){

        /**ID-07 Validate selecting multiple items with ctrl/cmd button and selecting the selected item*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/selectable/");

        // Find the selectable items
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]"));
        WebElement item2 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]"));
        WebElement item3 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.CONTROL)
                .click(item1)
                .click(item2)
                .click(item3)
                .click(item2)
                .keyUp(Keys.CONTROL)
                .perform();
    }

    @Test
    void resiable() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/resizable/");

        WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));


        int initialWidth = resizable.getSize().getWidth();
        int initialHeight = resizable.getSize().getHeight();

        Actions resize = new Actions(driver);

        resize.moveToElement(resizable)
                .clickAndHold()
                .moveByOffset(-(initialWidth - 300), - (initialHeight - 300))
                .release()
                .perform();

        Thread.sleep(3000);

    }

}
