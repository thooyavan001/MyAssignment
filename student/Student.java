package org.student;

import org.department.Department;

public class Student extends Department {
	 public void studentName() {
		 System.out.println("Thooyavan");
	 }
	 public void studentDept() {
		 System.out.println("Mechanical Engineering");
	 }
	 public void studentId() {
		 System.out.println("PGI12345");
	 }
	 
	 public static void main(String[] args) {
		Student studentDetail=new Student();
		studentDetail.collegeName();
		studentDetail.collegecode();
		studentDetail.collegeRank();
		studentDetail.deptName();
		studentDetail.studentName();
		studentDetail.studentDept();
		studentDetail.studentId();
	}

}
