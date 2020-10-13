package com.capg.JUnit.maximum.TestMaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum<T extends Comparable<T>> {
	private static Logger LOG = LogManager.getLogger(FindMaximum.class);
	static Scanner sc = new Scanner(System.in);
	
	private T firstValue;
	private T secondValue;
	private T thirdValue;
	
	public FindMaximum(T firstValue, T secondValue, T thirdValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}
	
	public T findMax() {
		return findMax(firstValue,secondValue,thirdValue);
		
	}

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

		LOG.info("Maximum Number in 32,23,46 is : " + (new FindMaximum<Integer>(32, 23, 46).findMax()));
		LOG.info("Maximum Number in 2.5f,3.5f,9.5f is : " + (new FindMaximum<Float>(2.5f, 3.5f, 9.5f).findMax()));
		LOG.info("Maximum String in Apple,Peach,Banana is : " + (new FindMaximum<String>("Apple", "Peach", "Banana").findMax()));

	}
}
