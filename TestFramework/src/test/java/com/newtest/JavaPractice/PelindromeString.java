package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class PelindromeString {

	@Test
	public void pelindromeTest()
	{
		String str="abcba";
		String reverseString="";
		int strLength=str.length();
		
		for(int i=strLength-1; i>=0; i--)
		{
			reverseString=reverseString+ str.charAt(i);
		}
		System.out.println(reverseString);
		if(str.equals(reverseString))
		{
			System.out.println("This is pelindrome String");
		}
		else
		{
			System.out.println("This is not a pelindrome String");
		}
	}
}
