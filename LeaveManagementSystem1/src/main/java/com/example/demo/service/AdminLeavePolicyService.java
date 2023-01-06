package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;


@Service
public class AdminLeavePolicyService {
	
	public void setLeaveDays(Admin adm) {
		adm.setAdoptionleave(30);
		adm.setCasualeave(15);
		adm.setSickleave(15);
		adm.setPersonalleave(15);
		adm.setMaternityleave(180);
		adm.setPaternityleave(30);
		adm.setMarriageleave(15);
	}

}