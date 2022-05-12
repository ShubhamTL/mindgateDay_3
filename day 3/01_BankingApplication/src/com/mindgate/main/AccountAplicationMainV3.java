package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountAplicationMainV3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		String userChoice;
		int choice;
		double amount;

		System.out.println("Welcome to STL bank");
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter Your Name");
		name = scanner.next();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		System.out.println("Account Opened Successfully.");

		Account account = new Account(accountNumber, name, balance);
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Depposit");
			System.out.println("3. Check Balance");

			System.out.println("Enter your Choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println(" Enter Amount");
				amount = scanner.nextDouble();
				boolean result = account.withdraw(amount);
				if (result) {
					System.out.println(" Transaction completed Successfully");
					System.out.println(" Balance::" + account.getBalance());
				} else {
					System.out.println(" Transaction failed");
					System.out.println(" Balance::" + account.getBalance());
				}
				System.out.println("-".repeat(100));
				break;
			}
			case 2: {
				System.out.println(" Enter Amount");
				amount = scanner.nextDouble();
				boolean result = account.deposit(amount);
				if (result) {
					System.out.println(" Transaction completed Successfully");
					System.out.println(" Balance::" + account.getBalance());
				} else {
					System.out.println(" Transaction failed");
					System.out.println(" Balance::" + account.getBalance());
				}
				System.out.println("-".repeat(100));
				break;
			}

			case 3: {
				System.out.println(" Balance::" + account.getBalance());
				System.out.println("-".repeat(100));
				break;
			}
			default:
				System.out.println("wrong Choice");
			}
			System.out.println("Do you want to continue");
			userChoice = scanner.next();
		} while (userChoice.equals("yes"));

		System.out.println("Thank you for banking with us!");
	}
}
