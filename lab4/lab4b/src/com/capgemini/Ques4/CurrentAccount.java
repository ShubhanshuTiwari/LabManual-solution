package com.capgemini.Ques4;

public class CurrentAccount extends Account {
	final long overdraftLimit=10000;
	public CurrentAccount(long accountNum, double balance, Person accHolder) {
		super(accountNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public boolean withdraw(double balance) {
		if(this.balance-balance>overdraftLimit) {
			return true;
		}
		return false;
			
		
 }
}
