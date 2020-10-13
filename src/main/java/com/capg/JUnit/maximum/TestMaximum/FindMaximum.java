package com.capg.JUnit.maximum.TestMaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum {
	private static Logger LOG = LogManager.getLogger(FindMaximum.class);
	static Scanner sc = new Scanner(System.in);

	public static <T extends Comparable<T>> T findMax(T firstValue, T secondValue, T thirdValue) {
		T maximumOfThree = firstValue;
		if (secondValue.compareTo(maximumOfThree) > 0) {
			maximumOfThree = secondValue;
		}
		if (thirdValue.compareTo(maximumOfThree) > 0) {
			maximumOfThree = thirdValue;
		}
		return maximumOfThree;
	}

	public static void main(String[] args) {

		LOG.info("Maximum Number in 32,23,46 is : " + findMax(32, 23, 46));
		LOG.info("Maximum Number in 2.5f,3.5f,9.5f is : " + findMax(2.5f, 3.5f, 9.5f));
		LOG.info("Maximum String in Apple,Peach,Banana is : " + findMax("Apple", "Peach", "Banana"));

	}
}
