package com.springBoot.Empoylee.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Empoylee.Entity.Employee;
import com.springBoot.Empoylee.Repo.EmployeeRepo;
import com.springBoot.Empoylee.Service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService
{
	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee e1 = employeeRepo.save(employee);
		return e1;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> e1 = employeeRepo.findById(id);
		if(e1.isPresent())
		{
			return e1.get();
		}
		return null;
		
	}

}
