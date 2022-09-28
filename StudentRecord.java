package com.orchard;

//24
import java.util.*;
public class StudentRecord {

	int Id;
	String Name;
	String Branch;
	
	
	public StudentRecord(int id, String name, String branch) {
		super();
		Id = id;
		Name = name;
		Branch = branch;
	}
	public StudentRecord() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Branch=" + Branch + "]";
	}
	
	
	@SuppressWarnings("resource")
	public static StudentRecord addstudent(){
			Scanner Sc = new Scanner(System.in);
			System.out.println("ID is: ");
			int id = Sc.nextInt();
			Sc.nextLine();
			System.out.println("Name is: ");
			String name = Sc.nextLine();
			System.out.println("Branch is: ");
			String branch = Sc.nextLine();
			StudentRecord ms = new StudentRecord(id,name,branch);
			
			System.out.println("Student record is created");
			return ms;
					
	}
	
	public static void displaystudent(ArrayList<StudentRecord> student) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("name of branch is");
		String s = Sc.nextLine();
		
		ArrayList<String> Names = new ArrayList<>();
		
		for(StudentRecord ms :student) {
			if(ms.Branch.equals(s)) {
				Names.add(ms.Name);
			}	
		}
		
		Collections.sort(Names);
		for(String n :Names) {
			System.out.println(n);
			}
		}
	
	public static void displayId(ArrayList<StudentRecord> student) {
		System.out.println("all the id are");
		ArrayList<Integer> ID = new ArrayList<>();
		for(StudentRecord ms :student) {
			ID.add(ms.Id);
		}
		
		Collections.sort(ID);
		for(Integer i :ID) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		ArrayList<StudentRecord> student = new ArrayList<>();
		
		StudentRecord sr =addstudent();
		StudentRecord sr1 =addstudent();		
		student.add(sr);
		student.add(sr1);
	
		StudentRecord.displaystudent(student);
		StudentRecord.displayId(student);	
	}

}
