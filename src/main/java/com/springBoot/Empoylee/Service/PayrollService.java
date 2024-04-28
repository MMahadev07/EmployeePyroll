package com.springBoot.Empoylee.Service;

import com.springBoot.Empoylee.Entity.Payroll;

public interface PayrollService
{
	Payroll createPayroll (Payroll payroll);
	Payroll getPayrollById(int id);
}
