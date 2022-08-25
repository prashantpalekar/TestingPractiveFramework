package com.newtest.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.newtest.Testing.BaseClass;
import com.newtest.Utilities.XLUtils;

public class DDT_LoginPg extends BaseClass{	
	
	@Test(dataProvider="Testdata")
	public void loginTest(String userNm, String Password, String exp)
	{	
		driver.get("https://essendev.ecares.io/Account/FormAuthenticationLogin");
		driver.manage().window().maximize();
		
		
	System.out.println(userNm + Password + exp);
	driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(userNm);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();

	System.out.println("PageTitle is " + driver.getTitle());
	String pageTitle = driver.getTitle();
	SoftAssert softA = new SoftAssert();

	if (exp.equals("validCredentials")) {
		if (pageTitle.equalsIgnoreCase("Home Page")) {
			softA.assertTrue(true);
			System.out.println("Passed! Logged in using valid credentials");

			driver.findElement(By.xpath("//form[@id='logoutForm']")).click();
			driver.get("https://essendev.ecares.io/Account/FormAuthenticationLogin");

		} else {
			softA.assertFalse(false);
			System.out.println("Failed! Login failed using valid credentials");
		}

	}

	if (exp.equals("invalid")) {
		if (pageTitle.equalsIgnoreCase("Home Page")) {
			softA.assertFalse(false);
			System.out.println("Failed! Logged in using Invalid credentials");

			driver.findElement(By.xpath("//form[@id='logoutForm']")).click();
			driver.get("https://essendev.ecares.io/Account/FormAuthenticationLogin");
		} else {
			softA.assertTrue(true);
			System.out.println("Passed! Login failed using Invalid credentials");
		}

	}

}

		
	
	@DataProvider(name="Testdata")
	public Object [][] testingData() throws Exception
	{
		String xlpath=".//src/test/java/com/newtest/TestData/DDT_LoginData.xlsx";
		XLUtils xl=new XLUtils();
		int rowCount=xl.getRowCount(xlpath, "sheet1");
		int cellCount=xl.getCellCount(xlpath, "sheet1", 1);
		
		Object loginValue[][]=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount ;j++)
			{
				loginValue[i-1][j]=xl.getCellData(xlpath, "sheet1", i, j);
			}
		}		
		return loginValue;
	}
	
	public void DDTValue()  //To check calling methods from multiple Class files into One class file without creating object
	{
		System.out.println("This value is from DDT test");
	}
}
