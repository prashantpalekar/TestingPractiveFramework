package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class Array_StaticArray {

	@Test
	public void OneDimensionalArray1() {
		int numb[] = new int[4];
		numb[0] = 5;
		numb[1] = 6;
		numb[2] = 7;
		numb[3] = 8;

		System.out.println(numb[2]);
		// System.out.println(numb[5]); //If I pass array value greater than array index
		// then it will give an error ArrayIndexOutOfBoundsException
		numb[2] = 15; // If we again define same array value, then while further printing it will
						// consider latest defined value
		System.out.println(numb[2]);
		System.out.println("----");
		// if we want to print all values then we can print using for loop
		for (int i = 0; i < 4; i++) {
			System.out.println(numb[i]);
		}
	}

	@Test
	public void OneDimensionalArray2() {
		int numbers[] = { 10, 15, 20, 25 };

		System.out.println(numbers[2]);
	}

	@Test
	public void arrayAddition() {
		int a[] = { 1, 2, 0, -1, 4, -3 };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int sum = a[i] + a[j];
				// System.out.print(sum);

				if (sum == 1) {
					System.out.print(sum);
					System.out.print(" >>i & j combination is " + a[i] + "," + a[j]);
					System.out.println();
				}

			}

		}

	}

}
