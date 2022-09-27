package com.newtest.JavaPractice;

import org.testng.annotations.Test;

//IF WE DO NOT APPLY BREAK IN CASE statement, then as soon as one of the case matches, then all the following cases of that statement will execute
public class SwitchCASE {

	@Test
	public void switchWithBREAK() {
		int x = 2;

		switch (x) {
		case 1:
			System.out.println("this is case 1");
			break;
		case 2:
			System.out.println("this is case 2");
			// break; //If break is not used, then all following statements will also
			// execute
		case 3:
			System.out.println("this is case 5");
			break;
		default:
			System.out.println("this is default case");
			break;
		}
	}

	@Test
	public void advanceSwitch() {
		int y = 3;

		switch (y) {
		/*
		 * THis is Advance switch statement which is used in Eclipse version greater
		 * than 14 case 1 -> System.out.println("this is case 1"); case 2 ->
		 * System.out.println("this is case 2"); case 3 ->
		 * System.out.println("this is case 5"); default->
		 * System.out.println("this is default case");
		 */

		}
	}
}
