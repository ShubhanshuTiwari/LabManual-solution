package com.capgemini.ques9;

import java.util.Scanner;
public class Teller {
Scanner sc=new Scanner(System.in);
	public void performTransfer(){
		
		Bank bank=new Bank();
		
	
			while(true) {
			System.out.println("Enter choice");
			System.out.println("1 add account");
			System.out.println("2 withdraw");
			System.out.println("3 Deposit");
			System.out.println("4 Transfer amount from one account to another");
			System.out.println("5Show balance details");
			System.out.println("6 exit");
			int choice= sc.nextInt();
			switch(choice) {
			case 1:System.out.println(bank.addAccount());
				break;
			case 2:System.out.println("Enter account no");
					int accountNo=sc.nextInt();
					System.out.println(bank.account[accountNo].withdraw( 500));
				break;
			case 3:System.out.println("Enter account no");
			int accountNoo=sc.nextInt();
				System.out.println(bank.account[accountNoo].deposit( 500));
				break;
			case 4:System.out.println("Enter your account no");
					int accno=sc.nextInt();
					System.out.println("Enter other account no");
					int accnoo=sc.nextInt();
					bank.transferAmount(accno,accnoo,500);
				break;
			case 5:System.out.println("Enter your account no");
				int acno=sc.nextInt();
						System.out.println(bank.showBalance(acno));
						break;
			case 6:System.exit(0);
				break;
			}
			
			}
			
		}
}
