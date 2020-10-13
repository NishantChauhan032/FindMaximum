package com.capg.JUnit.maximum.TestMaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum {
	private static Logger LOG = LogManager.getLogger(FindMaximum.class);
	static Scanner sc = new Scanner(System.in);

	public static Integer findMaximumInteger(Integer number1, Integer number2, Integer number3) {
		Integer maximumOfThree = number1;
		if (number2.compareTo(number1) > 0)
			maximumOfThree = number2;
		if (number3.compareTo(number1) > 0)
			maximumOfThree = number3;
		LOG.info("Maximum Number in 32,23,46 is : " + maximumOfThree);
		return maximumOfThree;

	}
	
	public static Float findMaximumFloat(Float float1, Float float2, Float float3) {
		Float maximumFloatOfThree = float1;
		if (float2.compareTo(float1) > 0)
			maximumFloatOfThree = float2;
		if (float3.compareTo(float1) > 0)
			maximumFloatOfThree = float3;
		LOG.info("Maximum Number in 2.5f,3.5f,9.5f is : " + maximumFloatOfThree);
		return maximumFloatOfThree;

	}

	public static void main(String[] args) {

		findMaximumInteger(32, 23, 46);
		findMaximumFloat(2.5f,3.5f,9.5f);

	}
}
