package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerLeavePolicyService {
	@Autowired
	ManagerRepository mrepo;
	public void setLeaveDays(Manager mng) {
		mng.setAdoptionleave(30);
		mng.setCasualeave(15);
		mng.setSickleave(15);
		mng.setPersonalleave(15);
		mng.setMaternityleave(180);
		mng.setPaternityleave(30);
		mng.setMarriageleave(15);
	}

 
}