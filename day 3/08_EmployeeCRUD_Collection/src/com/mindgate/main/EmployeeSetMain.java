package com.mindgate.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeADAO;
import com.mindgate.pojo.Employee;

public class EmployeeSetMain {
	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<Employee>();
		Employee employee1 = new Employee(104, "Shubham", 1000);
		Employee employee2 = new Employee(102, "Nitin", 2000);
		Employee employee3 = new Employee(103, "Pawan", 3000);

		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);

		Scanner scanner = new Scanner(System.in);
		EmployeeADAO employeeADAO = new EmployeeADAO();
		int choice;
		int employeeId;
		String name;
		double salary;
		String continueChoice;
		do {
		System.out.println("Menu \n 1. add new employee. \n 2. Update Employee \n 3. delet employee \n 4. Get single employee \n 5. Get All Employee ");
		  choice = scanner.nextInt();
		  switch (choice) {
		case 1: {
			System.out.println("for Adding employ Enter \n 1. emp Id \n 2. Emp name \n 3. Salary");
		   employeeId = scanner.nextInt();
		   name = scanner.next();
		   salary = scanner.nextDouble();
		   Employee employee = new Employee(employeeId, name, salary);
		   if(employeeADAO.addNewEmplyee(employee)) {
			   System.out.println("Employee data added successfully");
		   }
		   else 
			   System.out.println("Employee data not added");
		   break;
		}
        case 2: {
			
        	System.out.println("for update employ Enter \n 1. emp Id \n 2. new Emp name \n 3. new Salary");
 		   employeeId = scanner.nextInt();
 		   name = scanner.next();
 		   salary = scanner.nextDouble();
 		   Employee employee = new Employee(employeeId, name, salary);
 		   if(employeeADAO.updateEmployee(employee)){
 			   System.out.println("Employee data update successfully");
 		   }
 		   else 
 			   System.out.println("Employee data not update");
 		   break;
		}
        case 3: {

        	System.out.println("for delete employ Enter \n 1. emp Id ");
        	employeeId = scanner.nextInt();
        	if(employeeADAO.deleteEmployee(employeeId)) {
        		 System.out.println("new Employee data delete successfully");
        	}
        	else
        		 System.out.println("new Employee data not delete ");
        	 break;
	     
        }
         case 4: {
        	 System.out.println("for getting  single employee Enter \n 1. emp Id ");
         	employeeId = scanner.nextInt();
         	 System.out.println(employeeADAO.getEmployeeByEmployeeId(employeeId)); 
         	 break;
        	 
        }
        case 5: {
        	for (Employee employee : employeeADAO.getEmployees()) {
				System.out.println(employee);
			}
        	break;
        }
		default:
			System.out.println(" wrong choice");
			break;
			
		}
		System.out.println("do you want to continue");
		 continueChoice = scanner.next();
		}
		while(continueChoice.equals("yes"));
		System.out.println("thank you");
	}
}
