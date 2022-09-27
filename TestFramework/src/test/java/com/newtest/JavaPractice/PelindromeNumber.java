package com.newtest.JavaPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PelindromeNumber {
//Pelindrome number is the number which remains same even if we reverse it. like 141, 12321, etc
	@Test
	public void checkPelindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int enteredNum=sc.nextInt();
		int reveseNum=0;
		
		
		while(enteredNum!=0)
		{
			reveseNum=reveseNum*10+enteredNum%10;
			enteredNum=enteredNum/10;
		}
		System.out.println(reveseNum);
		
		if(enteredNum==reveseNum)
		{
			System.out.println("This is pelindromeNumber");
		}
		else
		{
			System.out.println("This is not a pelindrome number");
		}
	}
}
