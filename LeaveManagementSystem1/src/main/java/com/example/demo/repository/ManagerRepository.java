package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Integer> {
	Manager findByEmailAndPassword(String email,String password);
//	Optional<Manager>	findById(Integer id);
}
