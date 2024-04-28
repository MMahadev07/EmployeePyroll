package com.springBoot.Empoylee.Service;

import com.springBoot.Empoylee.Entity.Leave;

public interface LeaveService 
{
	
	Leave createLeave(Leave leave);
	Leave getleaveById(int id);
	
}
