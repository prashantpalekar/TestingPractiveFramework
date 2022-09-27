package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class SwappingTheNumber {

	// 3 different ways to swap 2 numbers
	@Test
	public void swappingLogic1() {
		int a = 5;
		int b = 7;
		System.out.println("value of A is " + a + " & value of B is " + b);

		int x = a;
		a = b;
		b = x;

		System.out.println("value of A is " + a + " & value of B is " + b);
	}

	@Test
	public void swappingLogic2() {
		int a = 5;
		int b = 7;
		System.out.println("value of A is " + a + " & value of B is " + b);

		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("value of A is " + a + " & value of B is " + b);
	}
@Test
	public void swappingLogic3()
	{
		int a=5;
		int b=7;
		System.out.println("value of A is "+a+" & value of B is "+b);
	int c=a*b;  //5*7=35
	a=c/a;     //35/5=7
	b=c/a;     //35/7=5
	System.out.println("value of A is "+a+" & value of B is "+b);	
}
}