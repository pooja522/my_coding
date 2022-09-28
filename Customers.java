package com.orchard;
import java.util.*;

class CustomerFd {
	public String Name;
	public String MobileNo;
	public double feedback;
	CustomerFd(String Name,String MobileNo,double feedback){
		this.Name=Name;
		this.MobileNo=MobileNo;
		this.feedback=feedback;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public double getFeedback() {
		return feedback;
	}
	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}
	public void display() {
		System.out.print(feedback+" out of 5\n");
	}
	
}
public class Customers {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int N=sc.nextInt();
		CustomerFd[] arr = new CustomerFd[N];
		for(int i=0;i<N;i++) {
			System.out.println("Enter the Customer Name:");
			String Name=sc.next();
			System.out.println("Enter the Customer Mobile Number:");
			String MobileNo=sc.next();
			System.out.println("Enter the feedback");
			double feedback=sc.nextDouble();
			arr[i]=new CustomerFd(Name,MobileNo,feedback);
		}
		for(int i=0;i<N;i++) {
			System.out.print("Customer"+(i+1)+":");
			arr[i].display();
		}
	}
}

