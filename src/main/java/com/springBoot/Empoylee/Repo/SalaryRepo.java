package com.springBoot.Empoylee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Empoylee.Entity.Salary;


@Repository
public interface SalaryRepo extends JpaRepository<Salary,Integer>
{

}
