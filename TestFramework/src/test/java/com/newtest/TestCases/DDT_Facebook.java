package com.newtest.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtest.Testing.BaseClass;
import com.newtest.Utilities.XLUtils;

public class DDT_Facebook extends BaseClass {

	@Test(dataProvider = "FBRegData")
	public void Fbreg(String FirstName, String LastName, String MobNo, String NewPassword, String DOB_Day,
			String DOB_Month, String DOB_Year, String Gender) throws Exception {
		driver.get(
				"https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcreate%2F%3Fref_type%3Dregistration_form&locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g')]")).sendKeys(MobNo);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(NewPassword);

		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByValue(DOB_Day);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText(DOB_Month);

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue(DOB_Year);

		String gender = Gender;
		if (gender == "female") {
			driver.findElement(By.xpath("//input[@value=1]")).click();
		} else {
			driver.findElement(By.xpath("//input[@value=2]")).click();
		}
		System.out.println("-----user data entered------");
		Thread.sleep(4000);

	}
	@DataProvider(name = "FBRegData")
	public Object[][] regData() throws Exception {
		String xlPath = "./src/test/java/com/newtest/TestData/DDT_LoginData.xlsx";
		String sheetnm = "Sheet2";
		XLUtils xl=new XLUtils();
		int rowCount=xl.getRowCount(xlPath, sheetnm);
		int cellCount=xl.getCellCount(xlPath, sheetnm, 1);
		
		Object data[][]=new String[rowCount][cellCount];
	for(int i=1; i<=rowCount;i++)
	{
		for(int j=0; j<cellCount; j++)
		{
			data[i-1][j]=xl.getCellData(xlPath, sheetnm, i, j);
		}
	}
	return data;
	
	
	}

}
