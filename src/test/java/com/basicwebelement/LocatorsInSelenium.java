package com.basicwebelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
    public static WebDriver driver;  //declare diver globally to use any where in project

    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
    }
}
