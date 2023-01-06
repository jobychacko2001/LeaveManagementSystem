package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.model.Employee;


@Service
public class PasswordGenerationService {
	public String generatePassword() {
			
		 int length = 10;
	     String finalString="-/.^&*_!@%=+>)ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	     Random random = new Random(); 

	     char[] password = new char[length]; 

	     for (int i = 0; i < length; i++) 
	     { 
	         password[i] = finalString.charAt(random.nextInt(finalString.length())); 

	     } 
	     String str = String.valueOf(password);
	     return str;
		}
	
}