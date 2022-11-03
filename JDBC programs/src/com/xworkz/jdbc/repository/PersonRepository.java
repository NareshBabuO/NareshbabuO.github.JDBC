package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.PersonDTO;

public interface PersonRepository {
	
	boolean Save(PersonDTO dto);
	
	void display();
	
	void displayAllAgeGreaterThenOrderByName(int age);
	
	void displayAllByGenderDescOrderByName(String gender);

	void displayAllBySalaryGreaterThanOrderByDesc(double salary);
	
	void displayCount();
	
	void displaySumOfSalary();
}
