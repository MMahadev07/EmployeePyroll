package com.springBoot.Empoylee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Empoylee.Entity.Payroll;
@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Integer>
{

}
