package com.orchard;

class Student{
	int studentId;
	String studentName;
	boolean secondChance;
	
	Student(int id, String name, boolean secondCh){
		this.studentId=id;
		this.studentName=name;
		this.secondChance=secondCh;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public boolean getsecondCha() {
		return secondChance;
	}
	public float getMarks() {
		
	}
	
	void identifyMarks(float marks) {
		
	}
	
	
	public void display() {
		System.out.println(studentId+" "+studentName+" "+secondChance);
	}
}

	public class StudentInfo {

		public static void main(String[] args) {
		Student st=new Student(11,"devi",true);
	}
	
}
