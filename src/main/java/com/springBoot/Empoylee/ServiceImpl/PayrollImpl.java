package com.springBoot.Empoylee.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Empoylee.Entity.Payroll;
import com.springBoot.Empoylee.Repo.PayrollRepo;
import com.springBoot.Empoylee.Service.PayrollService;
@Service
public class PayrollImpl implements PayrollService
{
	@Autowired
	PayrollRepo payrollRepo;
	@Override
	public Payroll createPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		Payroll p1 = payrollRepo.save(payroll);
		return p1;
	}

	@Override
	public Payroll getPayrollById(int id) {
		// TODO Auto-generated method stub
		Optional<Payroll> p1 = payrollRepo.findById(id);
		if(p1.isPresent())
		{
			return p1.get();
		}
		return null;
	}

}
