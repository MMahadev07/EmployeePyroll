package com.springBoot.Empoylee.Service;


import com.springBoot.Empoylee.Entity.Employee;

public interface EmployeeService 
{

	Employee createEmployee(Employee employee);
	Employee getEmployeeById(int id);
	
}
