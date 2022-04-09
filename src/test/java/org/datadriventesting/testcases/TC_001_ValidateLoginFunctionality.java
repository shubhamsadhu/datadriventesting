package org.datadriventesting.testcases;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.datadriventesting.base.DriverInstance;
import org.datadriventesting.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {
    @Test(dataProvider = "Excel")
    public void tc_001_login_functionality(String uname, String pass) throws IOException, InterruptedException {
        LoginPage login=new LoginPage(driver);
        login.enterusername(uname);
        login.enterpassword(pass);
        Thread.sleep(2000);
        login.clickSignin();
    }
    @DataProvider(name="Excel")
    public Object[][] testDataGenerator() throws IOException {
        //create simple string array
        //Object[][] data = {{"Unam1", "pass1"}, {"Unam2", "pass2"}, {"Unam3", "pass3"}};
        //return data;
        FileInputStream file = new FileInputStream("./TestData/testdata.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(file);
        HSSFSheet loginSheet = workbook.getSheet("Sheet1");
        int numberofData= loginSheet.getPhysicalNumberOfRows();
        Object [][] testData=new Object[numberofData][2];

        for(int i=0;i<numberofData;i++)
        {
            HSSFRow row = loginSheet.getRow(i);
            HSSFCell username = row.getCell(0);
            HSSFCell password = row.getCell(1);
            testData[i][0] = username.getStringCellValue();
            testData[i][1] = password.getStringCellValue();
        }
        return testData;


    }
}
