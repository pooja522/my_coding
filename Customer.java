package com.orchard;

public class Customer {
	private int custId;
	private String custName;
	private String custAdd;
	private String accType;
	private double custBal;
	
	Customer(){
		
	}
	
	Customer(int id, String name, String addr, String accType, double bal){
		this.custId=id;
		this.custName=name;
		this.custAdd=addr;
		this.accType=accType;
		this.custBal=bal;
	}
	Customer (int id,String name){
		this.custId=id;
		this.custName=name;
	}
	Customer (int id, String name, String addr){
		this.custId=id;
		this.custName=name;
		this.custAdd=addr;
	}
	
	
	public int getId() {
		return custId;
	}
	public void setId(int id) {
		this.custId=id;
	}
	public String getName() {
		return custName;
	}
	public void setName(String name) {
		this.custName=name;
	}
	public String getAdd() {
		return custAdd;
	}
	public void setAdd(String addr) {
		this.custAdd=addr;
	}
	public String getType() {
		return accType;
	}
	public void setType(String accType) {
		this.accType=accType;
	}
	public double getBal() {
		return custBal;
	}
	public void setBal(double bal) {
		this.custBal=bal;
	}
	public void display() {
		System.out.println(custId+" "+custName+" "+custAdd+" "+accType+" "+custBal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Customer();
		Customer c=new Customer(11,"devidas","Medak","savings",10222);
		Customer c1=new Customer(10,"devi");
		Customer c2=new Customer(12,"Sai","Warangal");
		
		c.display();
		c1.display();
		c2.display();
	}
	
}
