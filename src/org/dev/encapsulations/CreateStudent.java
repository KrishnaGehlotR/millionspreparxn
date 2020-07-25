package org.dev.encapsulations;

class Student {

	private int studentId;
	private String studentName = null;
	private long studentPhoneNumber;
	private String studentAddress = null;
	private String studentMailId = null;
	private String studentDegree = null;
	private int yop;

	// Constructor
	Student(int studentId, String studentName, long studentPhoneNumber) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
	}

	Student(int studentId, String studentName, String studentMailId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMailId = studentMailId;
	}

	int getStudentId() {
		return studentId;
	}

	String getStudentName() {
		return studentName;
	}

	long getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	String getStudentMailId() {
		return studentMailId;
	}

	String getStudentAddress() {
		return studentAddress;
	}

	String getStudentDegree() {
		return studentDegree;
	}

	int getStudentYop() {
		return yop;
	}

	void setStudentPhoneNumber(long studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

	void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	void printStudentDetails() {
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Phone Number:" + studentPhoneNumber);
		System.out.println("Student Mail Id: " + studentMailId);
		System.out.println("Student Address: " + studentAddress);
		System.out.println("Student Degree: " + studentDegree);
		System.out.println("Student Yop: " + yop);
	}
}

public class CreateStudent {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Yo Yo Honey Singh", 9876543210l);
		Student s2 = new Student(2, "Krishna Gehlot", "krishna@rdd.co.in");

		System.out.println(s1.getStudentName());
		s1.setStudentPhoneNumber(9517368420l);
		System.out.println(s1.getStudentPhoneNumber());
		s2.printStudentDetails();
	}
}
