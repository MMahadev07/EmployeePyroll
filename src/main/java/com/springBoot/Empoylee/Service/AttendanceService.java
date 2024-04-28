package com.springBoot.Empoylee.Service;

import com.springBoot.Empoylee.Entity.Attendance;

public interface AttendanceService 
{
	Attendance createAttendance(Attendance attendance);
	Attendance getAttendanceById(int id);
	

}
