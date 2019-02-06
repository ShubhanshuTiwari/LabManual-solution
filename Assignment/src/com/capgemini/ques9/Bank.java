package com.capgemini.ques9;
import com.capgemini.ques9.Account;
public class Bank {
	
	Account[] account=new Account[10];
	static int counter=0;
	public boolean addAccount() {
		account[counter++]=new Account(10000);
		return true;
	}

	
	public boolean transferAmount(int accountNo,int accountNoo,double balance) {
		//System.out.println(account[0].getBalance());
		account[accountNo].setBalance(account[accountNo].getBalance()-balance);
		account[accountNoo].setBalance(account[accountNoo].getBalance()+balance);
		return true;
	}
	public String showBalance(int accountNo) {
		double balance=account[accountNo].getBalance();
		
		return "Account no->"+accountNo+"Balance->"+balance;
	}
	
/*	public void showBalance() {
		double total;
		total=acc[0].getBalance() +acc.getBalance();
		System.out.println(total);
		
 }*/
	
	
/*	public void transferAmount(int toAccount,int fromAccount,double amount) {
		double res;
		res=acc[fromAccount-1].getBalance()-amount;
		
		acc[toAccount-1].getBalance()+=amount;
}*/
}
