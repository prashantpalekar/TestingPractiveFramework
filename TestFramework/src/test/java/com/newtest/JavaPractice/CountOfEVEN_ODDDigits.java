package com.newtest.JavaPractice;

import org.testng.annotations.Test;

public class CountOfEVEN_ODDDigits {

	@Test
	public void CountEVENODDDigits()
	{
		int x=123456789;
		int evenCount=0;
		int oddCount=0;
		// We have defined EvenCount & OddCount as ZERO
		//We are dividing X by 10 and taking the reminder value i.e. last digit
		//Then we are checking if that Last digit is divided by 2 then we are getting its reminder as ZERO or not
		//If we get ZERO, then we are increasing EVEN count else we increase ODD count
		while(x>0)
		{
			int reminder=x%10;
			
			if(reminder%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			x=x/10;
		}
		System.out.println("Even Count is : "+ evenCount);
		System.out.println("Odd Count is : "+ oddCount);
		
	}
}
