package com.springBoot.Empoylee.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Empoylee.Entity.Leave;
import com.springBoot.Empoylee.Repo.LeaveRepo;
import com.springBoot.Empoylee.Service.LeaveService;
@Service
public class LeaveImpl implements LeaveService

{
	@Autowired
	LeaveRepo leaveRepo;
	@Override
	public Leave createLeave(Leave leave) {
		// TODO Auto-generated method stub
		Leave l1 = leaveRepo.save(leave);
		
		return l1;
	}

	@Override
	public Leave getleaveById(int id) {
		// TODO Auto-generated method stub
		Optional<Leave> l1 = leaveRepo.findById(id);
		if(l1.isPresent())
		{
			return l1.get();
		}
		return null;
	}

}
