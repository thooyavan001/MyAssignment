package org.college;



public class College{ 
	
	public void collegeName() {
		System.out.println("Professional Group Of Institutions");
	}
	public void collegecode() {
		System.out.println("7127");
	}
	public void collegeRank() {
		System.out.println("03");
	}
	public static void main(String[] args) {
		College myCollege=new College();
		myCollege.collegeName();
		myCollege.collegecode();
		myCollege.collegeRank();
		
		
	}
}