package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeLeavePolicyService {
	
	public void setLeaveDays(Employee emp) {
		emp.setAdoptionleave(30);
		emp.setCasualleave(15);
		emp.setSickleave(15);
		emp.setPersonalleave(15);
		emp.setMaternityleave(180);
		emp.setPaternityleave(30);
		emp.setMarriageleave(15);
	}

}