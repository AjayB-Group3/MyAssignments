package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name is Ajay");
	}
	
	public void studentDept() {
		System.out.println("Dept is CS");
	}
	
	public void studentID(){
		System.out.println("ID NO is TestLeaf-007");
		
	}
	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		
		student.deptName();
		
		student.studentName();
		student.studentDept();
		student.studentID();
		
	}
}
