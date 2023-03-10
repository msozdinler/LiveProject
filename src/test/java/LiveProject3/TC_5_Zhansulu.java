package LiveProject3;

import Utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_5_Zhansulu extends UtilityClass {
    @Test
    public void TC5() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPhotograph/empNumber/7");
        Wait(3);

        WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("admin123");
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();
        Wait(5);

        WebElement chooseFile= driver.findElement(By.cssSelector("input[type='file']"));
        chooseFile.sendKeys("/Users/Zhansulu/Desktop/girl.jpg");

        WebElement saveBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        saveBtn.click();
        driver.quit();
    }
}


