package org.dev.collectiondemo;

import java.util.Arrays;
import java.util.Comparator;

class CompareByCgpa implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		return s1.cgpa.compareTo(s2.cgpa);
	}
}

public class ComparatorStudent {

	public static void main(String[] args) {

		Student1[] student1 = { new Student1(100, "Krishn", 7.61), new Student1(200, "Suresh", 6.73),
				new Student1(300, "Ramesh", 8.67) };

		System.out.println("===> Before Sorting");
		for (Student1 std : student1)
			System.out.println(std);
		System.out.println();

		Arrays.sort(student1, new CompareByCgpa());

		System.out.println("===> After Sorting");
		for (Student1 std : student1)
			System.out.println(std);
	}
}
