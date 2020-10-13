package com.capg.JUnit.maximum.TestMaximum;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaximumNumber_atFirstPosition_shouldReturnSameNumber() {
		Integer[] integerArray = { 32, 23, 22, 12, 11, 14 };
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer) 32, maximumOfAll);

		Float[] floatArray = { 18.5f, 15.5f, 7.5f, 9.5f, 1.5f };
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 18.5f, maximumFloatOfAll);

		String[] stringArray = { "Enjoy", "Apple", "Ball", "Cat", "Dog", "dog", "cat" };
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}

	@Test
	public void givenMaximumNumber_atSixthPosition_shouldReturnSameNumber() {
		Integer[] integerArray = { 32, 23, 22, 12, 11, 94, 93 };
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer) 94, maximumOfAll);

		Float[] floatArray = { 12.5f, 15.5f, 7.5f, 9.5f, 1.5f, 25.5f, 1.1f };
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 25.5f, maximumFloatOfAll);

		String[] stringArray = { "Apple", "Ball", "Cat", "Dog", "dog", "Enjoy", "cat" };
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}

	@Test
	public void givenMaximumNumber_atSecondPosition_shouldReturnSameNumber() {
		Integer[] integerArray = { 32, 123, 22, 12, 11, 94, 93 };
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer) 123, maximumOfAll);

		Float[] floatArray = { 12.5f, 15.5f, 7.5f, 9.5f, 1.5f };
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 15.5f, maximumFloatOfAll);

		String[] stringArray = { "Apple", "Enjoy", "Cat", "Dog", "dog" };
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}
}
