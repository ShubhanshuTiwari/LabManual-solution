package com.capgemini.Ques4;

public class SavingAccount extends Account {
	final long minBalance=500;
	public SavingAccount(long accountNum, double balance, Person accHolder) {
		super(accountNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public boolean withdraw(double balance) {
		if(this.balance-balance>minBalance) {
			return true;
		}
		return false;
			
		
 }
	
	
}
