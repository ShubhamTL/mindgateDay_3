package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	 int userId;
     String name;
	 int age;
	
	public void acceptUserDetails() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(" enter userId");
			userId = scanner.nextInt();
			System.out.println("enter name");
			name= scanner.next();
			System.out.println("enter age");
			age= scanner.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println(" Invalid Input from user");
			System.out.println(" Please Enter valid values");
		}
		finally {
			System.out.println("Details Accepted!");
			scanner.close();
		}
		
	}
	public void displayDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}
}
