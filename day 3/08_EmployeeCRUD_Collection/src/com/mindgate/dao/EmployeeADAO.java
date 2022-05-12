package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeADAO {

	private Set<Employee> employeeSet = new HashSet<Employee>();
	 
	// add new employee
	public boolean addNewEmplyee(Employee employee) {
		if(employee!= null) {
			employeeSet.add(employee);
			return true;
		}
		return false;
		
	}
	// update existing employee
	public boolean updateEmployee(Employee employee) {
		for (Employee e: employeeSet) {
			if(e.getEmplyeeId() == employee.getEmplyeeId()){
			e.setName(employee.getName());
			e.setSalary(employee.getSalary());
			return true;
		}
		}
		return false;
	}
	// delete employee
	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmplyeeId()== employeeId)
			{
				employeeSet.remove(employee);
				return true;
			}	
		}
		
		return false;
		
	}
	
	// get single employee by employee id
	public Employee getEmployeeByEmployeeId( int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmplyeeId()==employeeId){
				return employee;
			}
		}
		return null;
	}
	// get all the employees
	public Set<Employee> getEmployees(){
		return employeeSet;	
	}
}
