package com.capgemini.ques9;

public class Account {
	private long id=1;
	private double balance;
	private static long count=1;
	public Account( double balance) {
		
		this.id = count;
		this.balance = balance;
		count++;
	}
	
	public Account() {
		
	}

	public long getId() {
		return id;
	}
	
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  boolean withdraw(double balance) {
		 this.balance-=balance;
		
		 return true;
	}
	 public boolean deposit(double balance) {
		this.balance+=balance; 
		
		return true;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
}
