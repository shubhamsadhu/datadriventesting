/*
    testing world, datadriventesting tutorial part 6 assertion
    date 3/04/22
 */
package org.datadriventesting.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
    //method to validate page Url
    public static boolean validatePageURL(WebDriver driver, String expURL)
    {
        boolean flag=false;
        if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
        {
            flag=true;
        }
        return flag;
    }
    //method to validate page title
    public static boolean validatePageTitle(WebDriver driver, String expTitle)
    {
        boolean flag=false;
        if(driver.getTitle().equalsIgnoreCase(expTitle))
        {
            flag=true;
        }
        return flag;
    }
}
