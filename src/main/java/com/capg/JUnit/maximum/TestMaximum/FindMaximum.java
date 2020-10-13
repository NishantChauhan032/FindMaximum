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
		LOG.info("Maximum Number is : " + maximumOfThree);
		return maximumOfThree;

	}

	public static void main(String[] args) {

		LOG.info("Enter Number 1 : ");
		Integer n1 = sc.nextInt();
		LOG.info("Enter Number 2 : ");
		Integer n2 = sc.nextInt();
		LOG.info("Enter Number 3 : ");
		Integer n3 = sc.nextInt();
		findMaximumInteger(n1, n2, n3);

	}
}
