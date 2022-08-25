package com.newtest.TestCases;

import java.util.Set;

import javax.annotation.RegEx;

import org.testng.annotations.Test;

import com.newtest.Testing.BaseClass;

public class StringTest extends BaseClass {

	@Test
	public void StringMethods() {
		String x = "ABC123";
		String y = "123.5 USD";
		System.out.println(x.length());
		String z = x.concat(y);
		System.out.println("Concatinated values are:" + z);

		String a = x.replace('B', '1');
		System.out.println(a);

		System.out.println(x);
		System.out.println(x.subSequence(1, 3));

		String OnlyChars = x.replaceAll("[0-9]", "");
		System.out.println("Character values of X are " + OnlyChars);

		String OnlyInt = x.replaceAll("[^0-9]", "");
		System.out.println("Number values of X are " + OnlyInt);

		int b = Integer.parseInt(x); // Converted into Integer
		System.out.println(b + 4);

	}


}
