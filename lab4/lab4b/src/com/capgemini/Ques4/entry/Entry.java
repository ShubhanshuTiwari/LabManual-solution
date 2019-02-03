package com.capgemini.Ques4.entry;

import com.capgemini.Ques4.Account;
import com.capgemini.Ques4.CurrentAccount;
import com.capgemini.Ques4.Person;
import com.capgemini.Ques4.SavingAccount;

public class Entry {
	static long x=10000;
	public static void main(String args[]) {
		
		Person smith=new Person("Smith",24);
		Person kathy=new Person("Kathy",21);
		Account account1=new SavingAccount(x,2000,smith);
		x++;
		Account account2=new CurrentAccount(x,3000,kathy);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account1.withdraw(500));
		System.out.println(account2.withdraw(1000));
		account1.deposit(10000);
		account2.deposit(10000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
	}
	
}
