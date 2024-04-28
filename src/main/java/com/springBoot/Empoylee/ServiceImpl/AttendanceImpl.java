package com.springBoot.Empoylee.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Empoylee.Entity.Attendance;
import com.springBoot.Empoylee.Repo.AttendanceRepo;
import com.springBoot.Empoylee.Service.AttendanceService;

@Service
public class AttendanceImpl implements AttendanceService
{
	@Autowired
	AttendanceRepo attendanceRepo;
	@Override
	public Attendance createAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		Attendance a1 = attendanceRepo.save(attendance);
		return a1;
	}

	@Override
	public Attendance getAttendanceById(int id) {
		// TODO Auto-generated method stub
		Optional<Attendance> a1 = attendanceRepo.findById(id);
		if(a1.isPresent())
		{
			return a1.get();
		}
		return null;
	}
	
	
	
}
