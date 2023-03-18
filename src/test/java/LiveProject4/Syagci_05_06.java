package LiveProject4;

import Utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Syagci_05_06 extends DriverClass {
    @Test
    public void invalidEmployeeName() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // * Step 1 – I login as an Admin
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();

        //* Step 2 – I navigate to Admin / User Management page.
        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();

        // * Step 3 – I click on Add button
        WebElement addButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();

        //Step 4 – I enter an invalid name in to the Employee name field
        WebElement invalidEmployeeName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        invalidEmployeeName.sendKeys("Chaplain");

        //Step 5 – I verify that notification messages “no records found” and “invalid” in red color displayed.

        WebElement invalidText = driver.findElement(By.tagName("span"));
        WebElement color = driver.findElement(By.tagName("span"));
        System.out.println(color);
        String expectedMessage = "Invalid";
        String expectedColor = "rgba(255, 255, 255, 1)";

        Assert.assertTrue(invalidText.isDisplayed(), "Invalid");
        Assert.assertEquals(invalidText.getCssValue("color"), "rgba(255, 255, 255, 1)");


    }
    @Test
    public void invalidUsername_06() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // * Step 1 – I login as an Admin
        wait(10);
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();

        //* Step 2 – I navigate to Admin / User Management page.
        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();

        // * Step 3 – I click on Add button
        WebElement addButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();

        //Should be at least 5 characters
        WebElement invalidUsername = driver.findElement(By.cssSelector("input[autocomplete='off']"));
        invalidUsername.sendKeys("Alex");

        //Step 5 – I verify that notification messages “no records found” and “invalid” in red color displayed.

        WebElement invalidMessage = driver.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
        // String color = driver.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getCssValue("color");
        // System.out.println(color);

        String expectedMessage = "Should be at least 5 characters";
        String expectedColor = "rgba(235, 9, 16, 1)";

        Assert.assertEquals(invalidMessage.getText(), "Should be at least 5 characters");
        Assert.assertEquals(invalidMessage.getCssValue("color"), "rgba(235, 9, 16, 1)");
    }
    }
