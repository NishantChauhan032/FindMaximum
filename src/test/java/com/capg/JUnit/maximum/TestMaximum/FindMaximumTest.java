package com.capg.JUnit.maximum.TestMaximum;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest{
	
	@Test
	public void givenMaximumNumber_atFirstPosition_shouldReturnSameNumber() {
		Integer number1 = 32;
		Integer number2 = 23;
		Integer number3 = 29;
		Integer maximumOfThree = FindMaximum.findMaximumInteger(number1,number2,number3);
		Assert.assertEquals(number1, maximumOfThree);	}
	
	@Test
	public void givenMaximumNumber_atSecondPosition_shouldReturnSameNumber() {
		Integer number1 = 32;
		Integer number2 = 93;
		Integer number3 = 29;
		Integer maximumOfThree = FindMaximum.findMaximumInteger(number1,number2,number3);
		Assert.assertEquals(number2, maximumOfThree);	}
	
	@Test
	public void givenMaximumNumber_atThirdPosition_shouldReturnSameNumber() {
		Integer number1 = 32;
		Integer number2 = 23;
		Integer number3 = 92;
		Integer maximumOfThree = FindMaximum.findMaximumInteger(number1,number2,number3);
		Assert.assertEquals(number3, maximumOfThree);	}
}


