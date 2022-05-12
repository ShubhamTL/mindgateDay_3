package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountApplicationMainV5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		String userChoice;
		int choice;
		double amount;
		boolean result;
		boolean isSalary;
		

		System.out.println("Welcome to STL bank");
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter Your Name");
		name = scanner.next();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		System.out.println("Do you want to open salary account ? true or false.");
		isSalary = scanner.nextBoolean();

		Account account = new Savings(accountNumber, name, balance, isSalary);
		System.out.println("Account Opened Successfully.");
		do {
			System.out.println("Menu \n 1. Withdraw \n 2. Depposit \n 3. Check Balance \n Enter your Choice");
			
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println(" Enter Amount");
				amount = scanner.nextDouble();
				 result = account.withdraw(amount);
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
				result = account.deposit(amount);
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
