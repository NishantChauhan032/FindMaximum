package com.capg.JUnit.maximum.TestMaximum;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaximumNumber_atFirstPosition_shouldReturnSameNumber() {
		Integer[] integerArray = {32,23,22,12,11,14}; 
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer) 32, maximumOfAll);
	}
	@Test
	public void givenMaximumFloat_atFirstPosition_shouldReturnSameNumber() {
		Float[] floatArray = {18.5f,15.5f,7.5f,9.5f,1.5f};
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 18.5f, maximumFloatOfAll);
	}
	@Test
	public void givenMaximumString_atFirstPosition_shouldReturnSameString() {
		String[] stringArray = {"dog","Apple","Ball","Cat","Dog","cat"};
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}

	@Test
	public void givenMaximumNumber_atSixthPosition_shouldReturnSameNumber() {
		Integer[] integerArray = {32,23,22,12,11,94,93}; 
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer) 94, maximumOfAll);
	}
	@Test
	public void givenMaximumFloat_atSixthPosition_shouldReturnSameNumber() {
		Float[] floatArray = {12.5f,15.5f,7.5f,9.5f,1.5f,25.5f,1.1f};
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 25.5f, maximumFloatOfAll);
	}
	@Test
	public void givenMaximumString_atSixthPosition_shouldReturnSameString() {
		String[] stringArray = {"Apple","Ball","Cat","Dog","PEACH","dog"};
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}

	@Test
	public void givenMaximumNumber_atSecondPosition_shouldReturnSameNumber() {
		Integer[] integerArray = {32,123,22,12,11,94,93}; 
		Integer maximumOfAll = new FindMaximum<Integer>(integerArray).findMax();
		Assert.assertEquals((Integer)123, maximumOfAll);
	}
	@Test
	public void givenMaximumFloat_atSecondPosition_shouldReturnSameNumber() {
		Float[] floatArray = {12.5f,15.5f,7.5f,9.5f,1.5f};
		Float maximumFloatOfAll = new FindMaximum<Float>(floatArray).findMax();
		Assert.assertEquals((Float) 15.5f, maximumFloatOfAll);
	}
	@Test
	public void givenMaximumString_atSecondPosition_shouldReturnSameString() {
		String[] stringArray = {"Apple","dog","Cat","Dog"};
		String maximumStringOfAll = new FindMaximum<String>(stringArray).findMax();
		Assert.assertEquals("dog", maximumStringOfAll);
	}
}
