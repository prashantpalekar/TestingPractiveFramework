package com.newtest.TestCases;

import org.testng.annotations.Test;

public class StarPattern1 {

	@Test
	public void fibonacciSeries()
	{
		int x=0;
		int y=1;
		for(int i=0; i<=10; i++)
		{
			System.out.print(x+" ,");
			int z=x+y;
			x=y;
			y=z;
		}
	}
	
	
	@Test
	public void firstStarPattern() {
		System.out.println("Belos is FirstStar Pattern");
		for (int i = 0; i < 5; i++) {
			// System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	@Test
	public void SecondStarPattern() {
		System.out.println("Belos is FirstStar Pattern");
		for (int i = 0; i <= 4; i++) {
			// System.out.print("*");

			for (int j = 4; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

	@Test
	public void ThirdStarPatter() // |>
	{
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------");
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

	@Test
	public void FourthstartPatter() // /|
	{
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	@Test
	public void FifthStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	
	@Test(invocationCount=10, timeOut=1000)
	public void test()
	{
		for(int x=0; x<=5; x++)
		{
			for(int y=5; y>=x ;y--)
			{
				System.out.print(" ");
			}
			for(int z=0; z<=x; z++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");

		}
	}
	

}
// 