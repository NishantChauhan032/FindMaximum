package com.capg.JUnit.maximum.TestMaximum;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaximumNumber_atFirstPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = new FindMaximum<Integer>(32, 23, 11).findMax();
		Assert.assertEquals((Integer) 32, maximumOfThree);

		Float maximumFloatOfThree = new FindMaximum<Float>(9.1f, 3.1f, 2.1f).findMax();
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = new FindMaximum<String>("Peach", "Apple", "Banana").findMax();
		Assert.assertEquals("Peach", maximumStringOfThree);
	}

	@Test
	public void givenMaximumNumber_atSecondPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = new FindMaximum<Integer>(32, 93, 29).findMax();
		Assert.assertEquals((Integer) 93, maximumOfThree);

		Float maximumFloatOfThree = new FindMaximum<Float>(3.1f, 9.1f, 2.1f).findMax();
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = new FindMaximum<String>("Apple", "Peach", "Banana").findMax();
		Assert.assertEquals("Peach", maximumStringOfThree);
	}

	@Test
	public void givenMaximumNumber_atThirdPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = new FindMaximum<Integer>(32, 31, 98).findMax();
		Assert.assertEquals((Integer) 98, maximumOfThree);

		Float maximumFloatOfThree = new FindMaximum<Float>(3.1f, 2.1f, 9.1f).findMax();
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = new FindMaximum<String>("Apple", "Banana", "Peach").findMax();
		Assert.assertEquals("Peach", maximumStringOfThree);
	}
}
