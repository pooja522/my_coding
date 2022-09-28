package com.orchard;

class SavingsAccount{
	public double balance;
	public int interestRate;
	public int accountNo;
	
	
	SavingsAccount(double bal, int interest, int accN){
		balance=bal;
		interestRate=interest;
		accountNo=accN;
	}
	
	void withDraw(double bal) {
		if(balance<bal) {
			System.out.println(bal+" not available to withdraw");
		}
		else {
			balance=balance-bal;
			System.out.println("Successfully Withdrawn:"+bal);
		}
	}
	void checkAmt() {
		System.out.println("Balance:"+balance);
	}
	
	void calculateInterest(int month) {
		double value;
		value = (balance * interestRate * month)/100;
		System.out.println("Interest:"+value);
	}
	
	void display(){
		
		System.out.println("Balance:"+balance+"\nRate:"+interestRate+"\nAccount No:"+accountNo);
	}
}


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount ac=new SavingsAccount(4000,2,6245789);
		ac.display();
		ac.withDraw(10000);
		ac.checkAmt();
		ac.calculateInterest(2);
		
	}
}