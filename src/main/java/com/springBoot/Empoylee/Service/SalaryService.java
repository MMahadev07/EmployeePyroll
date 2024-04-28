package com.springBoot.Empoylee.Service;

import com.springBoot.Empoylee.Entity.Salary;

public interface SalaryService 
{

	Salary createSalary (Salary salary);
	Salary getSalaryById(int id);
	
}
