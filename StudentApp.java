package com.orchard;
//23
class Student{
	private int StudentId;
	private String StudentName;
	private float marks;
	private boolean secondchance;
	public Student(int StudentId, String StudentName, float marks) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.marks = marks;
	}
	public Student(int StudentId, String StudentName, float marks, boolean secondchance) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.marks = marks;
		this.secondchance = secondchance;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public float getMarks() {
		return  marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public boolean isSecondchance() {
		return secondchance;
	}
	public void setSecondchance(boolean secondchance) {
		this.secondchance = secondchance;
	}
	public void IdentifyMarks(float mark) {
		setSecondchance(false);
	}
	public void IdentifyMarks(float mark1,float mark2) {
		setSecondchance(true);
		if (mark1 > mark2) {
			setMarks(mark1);		
		}
		else {
			setMarks(mark2);
		}
	}
	public void display() {
		System.out.println("Studnet details:");
		System.out.println("Student Id:"+getStudentId()+"\n Student Name: "+getStudentName()+
				"\n Student marks: "+getMarks()+"\n Student second chance: "+isSecondchance());
	}
	
}
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(1,"devidas",80);
		Student st2 = new Student(1,"Sai",50.0f,true);
		st2.IdentifyMarks(40,70);
		st1.IdentifyMarks(75);
		st1.display();
		st2.display();
		
	}
}


