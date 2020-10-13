package com.capg.JUnit.maximum.TestMaximum;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum<T extends Comparable<T>> {
	private static Logger LOG = LogManager.getLogger(FindMaximum.class);

	private T[] myArray;

	public FindMaximum(T[] myArray) {
		super();
		this.myArray = myArray;
	}

	public T findMax() {
		return findMax(myArray);

	}
	public T getMaximum() {
		printMaximum(findMax(myArray));
		return findMax(myArray);
	}
	private void printMaximum(T maxElement) {
		LOG.info("The maximum element is : "+maxElement);
	}

	public static <T extends Comparable<T>> T findMax(T[] elementList) {
		int tryIndex = 0;
		for (int index = 1; index < elementList.length; index++) 
			if (elementList[index].compareTo(elementList[tryIndex]) > 0) 
				tryIndex = index;
        return elementList[tryIndex];
		}
	
	public static void main(String[] args) {

		Integer[] integerArray = { 32, 23, 46, 93, 66 };
		LOG.info("Maximum Number in 32,23,46,93,66 is : " + (new FindMaximum<Integer>(integerArray).findMax()));

		Float[] floatArray = { 1.1f, 2.1f, 3.1f, 4.1f };
		LOG.info("Maximum Number in 1.1f,2.1f,3.1f,4.1f is : " + (new FindMaximum<Float>(floatArray).findMax()));

		String[] stringArray = { "hi", "hello", "hey", "hola" };
		LOG.info("Maximum String in hi,hello,hey,hola is : " + (new FindMaximum<String>(stringArray).findMax()));

	}
}
