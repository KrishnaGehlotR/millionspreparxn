package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

class Student3 implements Comparable<Student3> {

	int rollNo;
	String name;
	int age;

	Student3(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student3 s1) {

		if (age == s1.age)
			return 0;
		else if (age < s1.age)
			return 1;
		else
			return -1;
	}

}

public class ComparableStudentReverse {

	public static void main(String[] args) {
		ArrayList<Student3> lst = new ArrayList<Student3>();
		lst.add(new Student3(101, "Vijay", 23));
		lst.add(new Student3(106, "Ajay", 27));
		lst.add(new Student3(105, "Jai", 21));

		Collections.sort(lst);

		for (Student3 st : lst) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

	}
}
