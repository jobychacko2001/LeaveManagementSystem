package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

	List<Project> findByAssignedTeam(String assignedTeam);
	

	
}
