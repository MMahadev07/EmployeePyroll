package com.springBoot.Empoylee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Empoylee.Entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

}
