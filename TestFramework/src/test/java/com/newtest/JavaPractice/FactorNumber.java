package com.newtest.JavaPractice;

import org.testng.annotations.Test;
//Factor value of 5! is>> 5*4*3*2*1=210
public class FactorNumber {

	@Test
	public void factorValue()
	{
			int a=5;
			int f=a;
			for(int i=a-1; i>0; i--) {
				f=f*i;
			}
			System.out.println(f);
	}
}
