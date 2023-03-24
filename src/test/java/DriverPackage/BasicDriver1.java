package DriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasicDriver1 {

    private static WebDriver driver;    // ?????? null not exist yet

    public static WebDriver getDriver() {
        if (driver == null) {                             //if its null
            ChromeOptions options = new ChromeOptions();  //create new chorome driver
            options.addArguments("--remote-allow-origins=*");

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  //silent purpose


            driver = new ChromeDriver(options);            //help work vith new version of chrom
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        driver = null;

    }}
