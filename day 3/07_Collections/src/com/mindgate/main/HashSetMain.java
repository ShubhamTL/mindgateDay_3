package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> namSet = new HashSet<String>();

		namSet.add("Shubham");
		namSet.add("Shubham");
		namSet.add("pavan");
		namSet.add("pradip");
		namSet.add("pavan");
		namSet.add("Yogesh");

		System.out.println(namSet);
		System.out.println("-".repeat(60));
		
		Employee employee1 = new Employee(101, "Shubham", 10020);
		Employee employee2= new Employee(103, "Pradip", 20000);
		Employee employee3 = new Employee(104, "Tejas", 20000);
		Employee employee4 = new Employee(102, "Shubham", 10020);
		
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());
		
		Set<Employee> employeeset = new HashSet<Employee>();
		employeeset.add(employee1);
		employeeset.add(employee2);
		employeeset.add(employee3);
		employeeset.add(employee4);
		for (Employee employee : employeeset) {
			System.out.println(employee);
			
		}
		//Integer i= Integer.valueOf(10);
		//System.out.println(i.hashCode());
	}
}
