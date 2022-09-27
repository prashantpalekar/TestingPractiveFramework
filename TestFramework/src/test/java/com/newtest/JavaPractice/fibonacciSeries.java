package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class fibonacciSeries {

	//Fibonacci series is the Addition of Last 2 digits is equal to next New Number
	@Test
	public void fibonacci()
	{
		int n1=0; int n2=1; int sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<=10; i++)   // We are taking i=2 because we have already printed 0 & 1 in above statement
		{
			sum=n1+n2;
			System.out.print(" "+ sum);
			n1=n2;
			n2=sum;
		}
	}
}
