package org.datadriventesting.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.datadriventesting.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class DriverInstance {
    public static WebDriver driver;
    @BeforeMethod
    public void initiateDriverInstance() throws IOException {
        if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else{
            System.out.println("there is some error in driverinstance class");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get(Utility.fetchPropertyValue("BaseURL").toString());
    }

    @AfterMethod
    public void closeDriverInstance()
    {
        driver.quit();
    }
}
