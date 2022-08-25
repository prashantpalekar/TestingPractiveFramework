package com.newtest.TestCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.newtest.Testing.BaseClass;

public class BrowserScrollingTest extends BaseClass{
	
	//@Test(threadPoolSize =3, invocationCount = 3)
	@Test
	public void scrollingTest() throws Exception
	{
		System.out.println("Browser scrolling test launched");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Scroll using scroll(x,y);
		js.executeScript("scrollBy(0,1500);");   //to scroll down till specific height 
		Thread.sleep(4000);
		/*
		 * js.executeScript("scroll(500,0);"); //to scroll Up till specific height
		 * Thread.sleep(4000);
		 * js.executeScript("scroll(0,document.body.scrollHeight);"); //To scroll till
		 * the end of the page Thread.sleep(4000);
		 * 
		 * //Scroll Using window.scrollBy(x,y)
		 * js.executeScript("window.scrollBy(0,2700);"); //to scroll till specific
		 * height Thread.sleep(5000); js.executeScript("window.scrollBy(0,-500);"); //To
		 * scroll up till specific height Thread.sleep(5000);
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight);"); //To
		 * scroll till the end of the page Thread.sleep(5000);
		 * 	
		 * Thread.sleep(5000);
		 */
		
		
		
		
	}
	
	
	
}
