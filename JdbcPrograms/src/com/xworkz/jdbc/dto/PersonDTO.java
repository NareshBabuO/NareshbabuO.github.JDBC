package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PersonDTO {

	private int id;
	private String name;
	private String email;
	private long mobileNo;
	private String gender;
	private String qualification;
	private boolean married;
	private boolean working;
	private String companyName;
	private double salary;
	private int age;
	private int experience;
	private String location;
	private String city;
	private String state;
	private String country;
	private long adharNo;
	private long bankAcNO;
}
