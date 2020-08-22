package org.dev.collectiondemo;

import java.util.Arrays;

@SuppressWarnings("rawtypes")
class Student1 implements Comparable {

	Integer id;
	String name;
	Double cgpa;// In Double, compareTo(Comparable interface) and compare(Comparator interface)

	Student1(Integer id, String name, Double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public String toString() {
		return id + " " + name + " " + cgpa;
	}

	@Override
	public int compareTo(Object obj) {
//		return this.id.compareTo(((Student1) obj).id);
//		return this.name.compareTo(((Student1) obj).name);
		return this.cgpa.compareTo(((Student1) obj).cgpa);
	}
}

public class ComparableStudent {

	public static void main(String[] args) {

		Student1[] students1 = { new Student1(100, "Krishn", 7.64), new Student1(200, "Suresh", 6.78),
				new Student1(300, "Ramesh", 8.71) };

		System.out.println("Before Sorting");
		for (Student1 std : students1)
			System.out.println(std);

		Arrays.sort(students1);
		System.out.println();

		System.out.println("After Sorting");
		for (Student1 std : students1)
			System.out.println(std);
	}
}
