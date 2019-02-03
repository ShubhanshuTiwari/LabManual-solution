package com.capgemini.Ques4;

public class Account {
long accountNum;
double balance;
Person accHolder;

public Account( long accountNum,double balance, Person accHolder) {
	
	super();
	this.balance = balance;
	this.accHolder = accHolder;
	this.accountNum=accountNum;
	
}


public double getBalance() {
	return balance;
}


public void deposit(double balance) {
	this.balance+=balance;
}

public boolean withdraw(double balance) {
	
	this.balance-=balance;
	
	return true;
}


@Override
public String toString() {
	return "\nAccountNum -> "+accountNum+ "\nAccount holder Name->"+accHolder.getName()+"\n Accountholder Age->"+accHolder.getAge()+ "\nbalance->" + balance ;
}
}
