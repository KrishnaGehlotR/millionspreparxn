package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2> {

	int rollNo;
	String name;
	int age;

	Student2(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student2 s1) {

		if (age == s1.age)
			return 0;
		else if (age > s1.age)
			return 1;
		else
			return -1;
	}

}

public class ComparableStudentDemo {

	public static void main(String[] args) {
		ArrayList<Student2> lst = new ArrayList<Student2>();
		lst.add(new Student2(101, "Vijay", 23));
		lst.add(new Student2(106, "Ajay", 27));
		lst.add(new Student2(105, "Jai", 21));

		Collections.sort(lst);

		for (Student2 st : lst) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

	}
}
