package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class UtilityClass {
  public static WebDriver driver;

        public static WebDriver getDriver(){
            if (driver == null) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111

                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            }

            return driver;
       // WebDriverManager.chromedriver().setup();
      //  driver = new ChromeDriver();

    }

    public static void quitDriver(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

    public static void Wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
