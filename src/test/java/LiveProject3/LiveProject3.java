package LiveProject3;

import Utility.UtilityClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LiveProject3 extends UtilityClass {
/** TS-05 Check the upload of a JPG format image */
    @Test
    public void uploadPicture() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPhotograph/empNumber/7");
        //*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Enter the password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement pictureUpload= driver.findElement(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img"));
        pictureUpload.sendKeys("/Users/Zhansulu/Desktop/girl");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img")).click();

        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/button"));
        saveButton.click();


    }
}

