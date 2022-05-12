package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {
	public static void main(String[] args) {
Current current = new Current(101, "ShubhamLabde", 10000, 50000);
System.out.println(current);
System.out.println("Withdraw : 5000");
current.withdraw(5000);
System.out.println(current);// overdraftBalance= 50000, balance=5000
System.out.println("-".repeat(100));

System.out.println("Withdraw : 20000");
current.withdraw(20000);
System.out.println(current); //overdraftBalance= 35000, balance=0
System.out.println("-".repeat(100));

System.out.println("deposit : 5000");
current.deposit(5000);
System.out.println(current);//overdraftBalance= 40000, balance=0
System.out.println("-".repeat(100));

System.out.println("deposit : 10000");
current.deposit(10000);
System.out.println(current);// overdraftBalance= 50000, balance=000
System.out.println("-".repeat(100));
System.out.println("deposit : 15000");
current.deposit(15000);
System.out.println(current);// overdraftBalance= 50000, balance=15000
System.out.println("-".repeat(100));
}
}
