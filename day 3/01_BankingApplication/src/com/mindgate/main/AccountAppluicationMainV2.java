package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountAppluicationMainV2 {
	public static void main(String[] args) {
		Account account = new Account(201, "Shubham labde", 10000);
		boolean result = account.withdraw(100.0);
		if (result) {
			System.out.println(" Transaction completed Successfully");
			System.out.println(" Balance::"+ account.getBalance());
		}
		else {
			System.out.println(" Transaction failed");
			System.out.println(" Balance::"+ account.getBalance());
		}
		System.out.println("-".repeat(100));
		result=account.deposit(1000);
		if (result) {
			System.out.println(" Transaction completed Successfully");
			System.out.println(" Balance::"+ account.getBalance());
		}
		else {
			System.out.println(" Transaction failed");
			System.out.println(" Balance::"+ account.getBalance());
		}
	}
}
