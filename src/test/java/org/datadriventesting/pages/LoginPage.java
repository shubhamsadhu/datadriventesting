package org.datadriventesting.pages;

import org.datadriventesting.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;
    //create contructor to avoid writing Webdriver driver everytime
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    // create method
    public void enterusername(String uname) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);

    }

    public void enterpassword(String pass) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
    }

    public void clickSignin() throws IOException {
        driver.findElement(By.xpath(Utility.fetchLocatorValue("login_sign_xpath"))).click();
    }
}
