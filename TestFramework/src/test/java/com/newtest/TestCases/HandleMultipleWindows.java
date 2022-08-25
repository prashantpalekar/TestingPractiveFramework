package com.newtest.TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.newtest.Testing.BaseClass;

public class HandleMultipleWindows extends BaseClass {

	@Test
	public void windowhandling() throws Exception {
		System.out.println("This is windowhandling  method1");
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		Set<String> multiwindows = driver.getWindowHandles();
		System.out.println(multiwindows);
		Iterator<String> itr = multiwindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(dependsOnMethods = "windowhandling")
	public void switchingWindow() throws Exception {
		System.out.println("THis is switchingWindow method2");
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='New Window']")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for (String child : allWindows) {
			if (!child.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}

		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

	}

}
