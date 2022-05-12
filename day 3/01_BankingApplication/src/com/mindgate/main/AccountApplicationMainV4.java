package com.mindgate.main;

import com.mindgate.pojo.Savings;

public class AccountApplicationMainV4 {
	public static void main(String[] args) {
		Savings savings = new Savings(101, "Shubham labde", 2000, true);
		System.out.println(savings);
		savings.withdraw(200);
		System.out.println(savings);
		savings.deposit(772);
		System.out.println(savings);
	}
}
