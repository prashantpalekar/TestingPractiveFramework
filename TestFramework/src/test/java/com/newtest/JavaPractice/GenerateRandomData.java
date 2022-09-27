package com.newtest.JavaPractice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class GenerateRandomData {

	@Test 
	public void generateRandomStringNum()
	{
		//Approach_1: Using 'Random' class
		
		Random rand=new Random();
		int randomInt=rand.nextInt(1000);
		System.out.println(randomInt);
		
		double randomDecimalValue=rand.nextDouble();  //It will print values between 0.0 and  1.0
		System.out.println(randomDecimalValue);
		
		//Approach_2: Using 'MATH' class
		
		System.out.println(Math.random());    //It will print values between 0.0 and  1.0
		
		//Approach_3: Using Apache Commons Lang API
		String RandomNum=RandomStringUtils.randomNumeric(10); //It will print random 10 digit number
		System.out.println(RandomNum);
		
		String RandomText=RandomStringUtils.randomAlphabetic(10); //It will print random 10 characters
		System.out.println(RandomText);
	}
}
