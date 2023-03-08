package LiveProject3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class uploadImage {


        /**
         * Check the upload of a PNG format image
         */
        @Test
        void imageTesting() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            // Enter the username
            // WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
            //username.sendKeys("Admin");

            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            // Enter the password
            //WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            //password.sendKeys("admin123");

            // WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            //loginButton.click();
            //Thread.sleep(4000);
            // WebElement myInfo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
            //myInfo.click();


            //WebElement imageButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/img"));
            //imageButton.click();
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
            WebElement pictureUpload= driver.findElement(By.xpath("       //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img"));
            pictureUpload.sendKeys("bob-marley-png-image-purepng-transparent-png-24");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img")).click();

            WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/button"));
            saveButton.click();


    }
}
