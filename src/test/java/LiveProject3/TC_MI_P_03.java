package LiveProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.UtilityClass.driver;

public class TC_MI_P_03 {
    @Test

   // void loginTest() throws InterruptedException {
     //   WebDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
      //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      //  WebElement userName =driver.findElement(By.name("username"));
     //   userName.sendKeys("Admin");

        //WebElement password=driver.findElement(By.name("password"));
       // password.sendKeys("admin123");
   // }

    public void login()  {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement nameBox = driver.findElement(By.xpath("//input[@name='username']"));
        nameBox.sendKeys("Admin");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement leftButton = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
        leftButton.click();

        WebElement employeeImage = driver.findElement(By.className("employee-image"));
        employeeImage.click();

        WebElement uploadImageButton = driver.findElement(By.xpath("//button[@class='oxd-icon-button employee-image-action']"));
        //uploadImageButton.click();

        WebElement uploadInput = driver.findElement(By.className("oxd-file-input"));
        //uploadInput.sendKeys("/Users/asma/java_error_in_idea_48574.log");
        uploadInput.sendKeys("/Users/asma/Downloads/dummy.jpg");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }
}
