package com.newtest.Testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public String browserNm = "Chrome";

	@BeforeClass
	public void launchBrowser() {
		if (browserNm.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserNm.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		// sdf driver.get("https://essendev.ecares.io/Account/FormAuthenticationLogin");
		// --Use this for DataDrivenTest
		// driver.get("https://skpatro.github.io/demo/links/"); //URL for multiple
		// windows handling Test
		// driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
