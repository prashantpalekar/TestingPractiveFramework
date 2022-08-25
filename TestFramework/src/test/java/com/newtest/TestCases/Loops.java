package com.newtest.TestCases;

import org.testng.annotations.Test;

public class Loops {

	@Test
	public void MyforLoop()
{
		int marks[]=new int[4];
	marks [0] =10;
	marks [1]=20;
	marks [2]=30;
	marks [3]=40;
	
	for(int i=0; i<=3; i++)
	{
		System.out.println(marks[i]);
	}
}
	
	@Test
	public void forEachLoop()
	{
		String [] car= {"BMW", "AUDI", "MERCEDES"};
		
		for(String i : car)
		{
			System.out.println(i);
		}
		
	}
	@Test
	public void whileLoop()
	{
		int i=0;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
	}
	@Test
	public void doWhileLoop()
	{
		int x=0;
		do {
			System.out.println(x);
			x++;
		}
		while(x<=4);
		{
			System.out.println(x);
			x++;
		}
		
		
		
	}
	
	
	
}
