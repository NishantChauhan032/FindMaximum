package com.capg.JUnit.maximum.TestMaximum;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaximumNumber_atFirstPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = FindMaximum.findMaximumInteger(32, 23, 11);
		Assert.assertEquals((Integer) 32, maximumOfThree);

		Float maximumFloatOfThree = FindMaximum.findMaximumFloat(9.1f, 3.1f, 2.1f);
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = FindMaximum.findMaximumString("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", maximumStringOfThree);
	}

	@Test
	public void givenMaximumNumber_atSecondPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = FindMaximum.findMaximumInteger(32, 93, 29);
		Assert.assertEquals((Integer) 93, maximumOfThree);

		Float maximumFloatOfThree = FindMaximum.findMaximumFloat(3.1f, 9.1f, 2.1f);
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = FindMaximum.findMaximumString("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", maximumStringOfThree);
	}

	@Test
	public void givenMaximumNumber_atThirdPosition_shouldReturnSameNumber() {
		Integer maximumOfThree = FindMaximum.findMaximumInteger(32, 31, 98);
		Assert.assertEquals((Integer) 98, maximumOfThree);

		Float maximumFloatOfThree = FindMaximum.findMaximumFloat(3.1f, 2.1f, 9.1f);
		Assert.assertEquals((Float) 9.1f, maximumFloatOfThree);

		String maximumStringOfThree = FindMaximum.findMaximumString("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", maximumStringOfThree);
	}
}
