package com.springBoot.Empoylee.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Empoylee.Entity.Salary;
import com.springBoot.Empoylee.Repo.SalaryRepo;
import com.springBoot.Empoylee.Service.SalaryService;
@Service
public class SalaryImpl implements SalaryService
{
	@Autowired
	SalaryRepo salaryRepo;
	@Override
	public Salary createSalary(Salary salary) 
	{
		// TODO Auto-generated method stub
		Salary s1 = salaryRepo.save(salary);
		return s1;
	}

	@Override
	public Salary getSalaryById(int id) 
	{
		// TODO Auto-generated method stub
		Optional<Salary> s1 = salaryRepo.findById(id);
		if(s1.isPresent())
		{
			return s1.get();
		}
		return null;
	}

}
