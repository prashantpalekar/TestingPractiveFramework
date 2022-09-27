package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class ReverseChar {

	@Test
	public void reverseString1() // Using ArrayIndex approach toCharArray() method
	{
		String str = "ABCDE";

		char[] a = str.toCharArray();
		int aSize = a.length;
		for (int i = aSize - 1; i > 0; i--) {
			System.out.print(a[i]);
		}
	}

	@Test
	public void reverseString2() {
		String str = "ABCDE";
		int strSize = str.length();

		for (int i = strSize - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	@Test
	public void reverseInt1()
	{
		int x = 12345;

		StringBuffer sf = new StringBuffer(String.valueOf(x));
		System.out.println(sf.reverse());
	}
}
