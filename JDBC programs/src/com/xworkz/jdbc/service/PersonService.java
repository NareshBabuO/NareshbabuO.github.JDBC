package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.PersonDTO;

public interface PersonService {
	
	boolean ValidateAndSave(PersonDTO dto);
	
	void display();
	void displayAllAgeGreaterThanOrderbyName(int age);
	void displayAllByGenderDescOrderByName(String gender);
	void displayAllBySalaryGreaterThanOrderByDesc(double salary);
	void displayCount();
	void displaySumofSalary();

}
