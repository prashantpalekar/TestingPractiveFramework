package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class StringMethods {
@Test
	public void stringMethodTest()
	{
		String name="Harry";
		System.out.println(name.length());
		//1. length()	Returns the length of String name. (5 in this case)
		System.out.println(name.toLowerCase());
		//	2. toLowerCase()	Converts all the characters of the string to the lower case letters.
		System.out.println(name.toUpperCase());
		//3. toUpperCase()	Converts all the characters of the string to the upper case letters.
	
		String x="     abcd    ";
		System.out.println(x.trim());
		//4. trim()	Returns a new String after removing all the leading and trailing spaces from the original string.
		System.out.println(name.substring(3));  //It will return all the string from index 3	
		//5. substring(int start)	Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]
		System.out.println(name.substring(3, 5));  
		//6. It will return all the string from index 3 to 5-1
		//6. substring(int start, int end)	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
		System.out.println(name.replace('h','c'));
		//7. replace(‘r’, ‘p’)	Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
		System.out.println(name.startsWith("Ha"));	
		//8. startsWith(“Ha”)	Returns true if the name starts with the string “Ha”. (True in this case)
		System.out.println(name.endsWith("rr"));
		//9. endsWith(“rr”)	Returns false if the name does not ends with the string “rr”. (False in this case)
		System.out.println(name.charAt(2));
		//10. charAt(2)	Returns the character at a given index position. (r in this case)
		System.out.println(name.indexOf("r"));
		//11. indexOf(“s”)	Returns the index of the first occurrence of the specified character in the given string.
		System.out.println(name.lastIndexOf("r"));
		//12. lastIndexOf(“r”)	Returns the last index of the specified character from the given string. (3 in this case)
		System.out.println(name.equals("harry"));
		//13. equals(“harry”)	Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
		System.out.println(name.equalsIgnoreCase("harry"));
		//14.equalsIgnoreCase(“harry”)	Returns true if two strings are equal, ignoring the case of characters.

			

		
		
	}
}
