package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class CountNoOfDigitsInNumber {

	@Test
	public void countNoOfDigits()
	{
		int number=12345678;
		
		int count=0;
		
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Count of number is: "+count);
		
	}
}
