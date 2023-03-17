package LiveProject4;

import Utility.DriverClass;
import Utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class LiveProject4 extends DriverClass {
    @Test
    public void login() {
        /**
         * Test Case #3 Zhansulu
         * As an Admin user I should be able to see notification messages displayed, when I click on Save button without entering mandatory fields.
         * Step 1 – I login as an Admin
         * Step 2 – I navigate to Admin / User Management page.
         * Step 3 – I click on Add button
         * Step 4 – I click on Save button before entering any mandatory field.
         * Step 5 – I verify that notification messages in red color displayed.
         */
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();
        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();
    }

    @Test
    public void addButton() throws InterruptedException {
        login();
        wait(3);
        WebElement addButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();
        WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
        saveButton.click();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@class='orangehrm-card-container']"));
        String result = errorMessage.getText();

        Assert.assertTrue(errorMessage.isDisplayed(), "Invalid inputs");
    }

    @Test
    public void passwordConfirm() throws InterruptedException {
        addButton();
        /**
         * 4-
         * As an Admin user I should be able to see notification messages displayed, when I enter different values in to the “password’ and “password confirm” fields
         * Step 1 – I login as an Admin
         * Step 2 – I navigate to Admin / User Management page.
         * Step 3 – I click on Add button
         * Step 4 – I enter a required value in to the “password” field and different value in to the “confirm password” field
         * Step 5 – I verify that notification messages “Passwords do not match” in red color displayed.
         */
        WebElement passwordButton = driver.findElement(By.xpath("//input[@type='password'][1]"));
        passwordButton.sendKeys("ABCabc123%");

        WebElement passwordConrifm = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
        passwordConrifm.sendKeys("ABCabc123");

        WebElement notMatch = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/span"));
        wait(3);
        Assert.assertEquals(notMatch.getText(), "Passwords do not match", "Test is failed");
    }

    /**
     * Test Case 5 -
     * Mert Sozdinler
     */

    @BeforeMethod
    public void setUp() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();
        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();
    }

    @Test
    public void testAddUser() {

        WebElement addButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();
        WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
        saveButton.click();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@class='orangehrm-card-container']"));
     //   String result = errorMessage.getText();

        Assert.assertTrue(errorMessage.isDisplayed(), "Invalid inputs");

        WebElement userRoleDropdown = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
        WebElement employeeNameInput = driver.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
        WebElement statusDropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));
        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        WebElement confirmPasswordInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
        WebElement cancelButton = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        WebElement saveButton1 = driver.findElement(By.xpath("//button[@type='submit']"));

        Assert.assertTrue(userRoleDropdown.isDisplayed());
        Assert.assertTrue(employeeNameInput.isDisplayed());
        Assert.assertTrue(statusDropdown.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(confirmPasswordInput.isDisplayed());
        Assert.assertTrue(cancelButton.isDisplayed());
        Assert.assertTrue(saveButton1.isDisplayed());

        List<WebElement> elements = Arrays.asList(userRoleDropdown, employeeNameInput,
                statusDropdown, usernameInput, passwordInput, confirmPasswordInput,
                cancelButton, saveButton1);

        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                Assert.assertTrue(element.isDisplayed());
            } else {
                System.out.println("Not displayed");
            }

        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}







