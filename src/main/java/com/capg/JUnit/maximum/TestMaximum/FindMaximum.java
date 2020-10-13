package com.capg.JUnit.maximum.TestMaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum {
	private static Logger LOG = LogManager.getLogger(FindMaximum.class);
	static Scanner sc = new Scanner(System.in);

	public static Integer findMaximumInteger(Integer number1, Integer number2, Integer number3) {
		Integer maximumOfThree = number1;
		if (number2.compareTo(maximumOfThree) > 0)
			maximumOfThree = number2;
		if (number3.compareTo(maximumOfThree) > 0)
			maximumOfThree = number3;
		LOG.info("Maximum Number in 32,23,46 is : " + maximumOfThree);
		return maximumOfThree;

	}
	
	public static Float findMaximumFloat(Float float1, Float float2, Float float3) {
		Float maximumFloatOfThree = float1;
		if (float2.compareTo(maximumFloatOfThree) > 0)
			maximumFloatOfThree = float2;
		if (float3.compareTo(maximumFloatOfThree) > 0)
			maximumFloatOfThree = float3;
		LOG.info("Maximum Number in 2.5f,3.5f,9.5f is : " + maximumFloatOfThree);
		return maximumFloatOfThree;

	}
	
	public static String findMaximumString(String string1, String string2, String string3) {
		String maximumStringOfThree = string1;
		if (string2.compareTo(maximumStringOfThree) > 0)
			maximumStringOfThree = string2;
		if (string3.compareTo(maximumStringOfThree) > 0)
			maximumStringOfThree = string3;
		LOG.info("Maximum String in Apple,Peach,Banana is : " + maximumStringOfThree);
		return maximumStringOfThree;

	}

	public static void main(String[] args) {

		findMaximumInteger(32, 23, 46);
		findMaximumFloat(2.5f,3.5f,9.5f);
		findMaximumString("Apple","Peach","Banana");

	}
}
