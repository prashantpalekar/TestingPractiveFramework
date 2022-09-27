package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class CountSumOfDigitsInNumber {

	@Test
	public void sumOfDigits()
	{
		int x=12345;
		int sum=0;
		
		while(x>0)
		{
			sum=sum+x%10; 
			x=x/10;
		}
		System.out.println(sum);
		
	}
}
