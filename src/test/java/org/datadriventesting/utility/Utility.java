package org.datadriventesting.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    // use this method to call a value
    public  static Object fetchPropertyValue(String key) throws IOException
    {
        FileInputStream file = new FileInputStream("./config/config.properties");
        //create object
        Properties property = new Properties();
        property.load(file);
        return property.get(key);
    }

    public  static String fetchLocatorValue(String key) throws IOException
    {
        FileInputStream file = new FileInputStream("./config/Elements.properties");
        //create object
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }
}
