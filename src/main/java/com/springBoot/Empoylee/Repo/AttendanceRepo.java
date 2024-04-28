package com.springBoot.Empoylee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Empoylee.Entity.Attendance;
@Repository
public interface AttendanceRepo extends JpaRepository<Attendance,Integer>
{

}
