package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailMain {
public static void main(String[] args) {
	System.out.println("main Start");
	UserDetails details = new UserDetails();
	 details.acceptUserDetails();
	 details.displayDetails();
	 System.out.println("main end");
	 
	try {
		Class.forName("com.mindgate.pojo.UserDetails");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
