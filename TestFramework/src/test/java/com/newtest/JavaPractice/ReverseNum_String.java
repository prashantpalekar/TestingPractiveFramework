package com.newtest.JavaPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseNum_String {

	
	//KeyPoints::  //StringBuilder & StringBuffer are 2 class which have reverse() method. we can use one of them to reverse string or int value
	
	
	@Test
	public void reverseNoAndString() {
		Scanner sc = new Scanner(System.in); // Using this we can get the runtine input values
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();

		StringBuffer buffer = new StringBuffer(String.valueOf(number)); 
		StringBuffer revValue = buffer.reverse();
		System.out.println(revValue);
		
		System.out.println("-------------------------------");
		System.out.println("Enter a String :");
		String newText = sc.next();
		StringBuffer buf = new StringBuffer(newText);
		StringBuffer revText = buf.reverse();
		System.out.println(revText);

	}
@Test      //Prefer using FOR loop 
	public void revUsingForLoop()
	{
			int a=123456;
			int b;
			for(int i=5; i>=0; i--)
			{
				b=a%10;
				a=a/10;
				System.out.print(b);
			}
			//System.out.println(b);
	}
	@Test
public void reverseNoAndStringLogic2() {
	Scanner sc = new Scanner(System.in); // Using this we can get the runtine input values
	System.out.println("Enter a Number: ");
	int number = sc.nextInt();  //For numbers
	//String number=sc.next();    //For String
	StringBuilder sb=new StringBuilder();
	 //StringBuilder is a class which has reverse() method. using this we can reverse string or int value
	sb.append(number);
	StringBuilder revValue=sb.reverse();
	System.out.println(revValue);
	
}

	@Test
	public void reverseNoLogic2() {
		Scanner sc = new Scanner(System.in); // Using this we can get the runtine input values
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();

		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
	}
}
