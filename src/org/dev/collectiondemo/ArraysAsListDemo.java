package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {

		Double[] percentage = { 61.1, 80.2, 72.5, 74.9, 89.7, 56.8 };

		List<Double> lstPerc = Arrays.asList(percentage);
		System.out.println("lstPerc " + lstPerc);
		System.out.println(lstPerc.getClass().getName());

		System.out.println("Max Percentage= " + Collections.max(lstPerc));
		System.out.println("Min Percentage= " + Collections.min(lstPerc));

		try {
			lstPerc.add(45.3);// Exception
			// You cannot add elements to the list returned by the asList() method
		} catch (Exception e) {
		}

		ArrayList<Double> lstPer = new ArrayList<Double>(Arrays.asList(percentage));
		System.out.println(lstPer.getClass().getName());
		System.out.println("lstPer " + lstPer);
		lstPer.add(45.3);
		System.out.println("lstPer " + lstPer);
	}
}
