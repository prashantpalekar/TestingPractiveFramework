package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class LargestOf3Numbers {

	@Test
	public void findLargestNo()  //Approach 1
	{
		int x=500;
		int y=600;
		int z=700;
		
		if(x>y && x>z)
		{
			System.out.println("Largest Number is : "+x);
		}
		else if(y>x && y>z)
		{
			System.out.println("Largest Number is : "+y);
		}
		else
		{
			System.out.println("Largest Number is : "+z);
		}
	}
	@Test
	public void findLargestNo3()  //Approach 2 Using TERNERY OPERATOR ?
	{
		int x=500;
		int y=600;
		int z=700;
		
		int largestOf2= x>y?x:y;  //It will check if X is greater than Y. If X is greater then i will return X. If Y is greater then it will return Y
		System.out.println(largestOf2);
		
		int largestOf3=largestOf2>z?largestOf2:z;
		System.out.println("Largest of 3 numbers is : "+ largestOf3);
		
	}
}
