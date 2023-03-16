package LiveProject4;

import Utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utility.UtilityClass.getDriver;

public class TestCase_7_8 extends DriverClass {
    /**
     * TestCase#7 by Zhansulu and Asma
     * As an Admin user I should be able to see notification messages displayed, when I enter a value in to the username field which was already taken.
     * Step 1 – I login as an Admin
     * Step 2 – I navigate to Admin / User Management page.
     * Step 3 – I click on Add button
     * Step 4 – I enter a value in to the username which was already taken
     * Step 5 – I verify that notification messages “Already exists” in red color displayed.
     */

    @Test
    public void login(){

        // step-1
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();
        // step-2
        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();
        wait(3);
        //step-3
        WebElement addButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();
        // step-4
       WebElement userNameBox= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
       userNameBox.sendKeys("Admin");
       //step-5
        WebElement errorMessage= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/span"));
      String w="Already exists";
       wait(3);

        Assert.assertEquals(errorMessage.getText(),w,"Test Failed");

    }

    /**
     * Test Case#8 by Zhansulu and Asma
    8-As an Admin user I should be able to see Add button displayed, when I navigate to the User Management page
   Step 1 – I login as an Admin
   Step 2 – I navigate to Admin / User Management page.
   Step 3 – I verify that “Add” button is displayed.
     */


    @Test
    public void notificationMessages() throws InterruptedException {
        login();
        WebElement adminButton =driver.findElement(By.xpath("//span[text()='Admin']"));

        adminButton.click();

        WebElement adButton =driver.findElement(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']"));

        Thread.sleep(3000);
        Assert.assertTrue(adButton.isDisplayed(),"Test is failed");

    }
}
