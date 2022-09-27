package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class NoIsPrimeOrNot_11 {

	// Prime Number: If a number has only 2 factors. i.e. Number is divisible by 1 &
	// Itself then it is called prime number
	@Test
	public void checkPrimeNo() {
		int x = 11;
		int num = 0;

		if (x > 0) {
			for (int i = 1; i <= x; i++) 
			{
				if (x % i == 0) 
					num++;
			}
			if (num == 2) {
				System.out.println("This is a prime number");
			}

			else {
				System.out.println("This is not a prime number");
			}

		} else {
			System.out.println("This is not a prime number");
		}
	}
}
