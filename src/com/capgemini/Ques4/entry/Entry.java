package com.capgemini.Ques4.entry;

import com.capgemini.Ques4.Account;
import com.capgemini.Ques4.Person;

public class Entry {
	static long x=10000;
	public static void main(String args[]) {
		
		Person smith=new Person("Smith",24);
		Person kathy=new Person("Kathy",21);
		Account account1=new Account(x,2000,smith);
		x++;
		Account account2=new Account(x,3000,kathy);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		account1.withdraw(500);
		account2.withdraw(1000);
		account1.deposit(10000);
		account2.deposit(10000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
	}
	
}
