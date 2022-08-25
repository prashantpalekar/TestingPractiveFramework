package com.newtest.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.bouncycastle.util.test.TestRandomBigInteger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.newtest.Testing.BaseClass;
import com.newtest.TestCases.Loops;

public class PolymorphismTest {
	
	    public static void main(String[] args) {
	    	OveloadingTest overload=new OveloadingTest();
	        
	        System.out.println(overload.sum(4,5));
	        System.out.println(overload.sum(4,5,6));
	        
	    }
	}   
	     class OveloadingTest{
	     
	        public static int sum(int x, int y)
	        {
	            return x+ y;
	        }
	        
	        public static int sum(int x, int y, int z)
	        {
	            return x+ y+ z;
	        }
	    }
