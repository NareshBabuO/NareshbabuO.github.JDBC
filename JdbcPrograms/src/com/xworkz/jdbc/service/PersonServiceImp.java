package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.PersonDTO;
import com.xworkz.jdbc.repository.PersonRepository;
import com.xworkz.jdbc.repository.PersonRepositoryImp;

public class PersonServiceImp implements PersonService {

	@Override
	public boolean ValidateAndSave(PersonDTO dto) {
		System.out.println("Validation Checking started");
		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		long mobileNo = dto.getMobileNo();
		String gender = dto.getGender();
		String qualification = dto.getQualification();
		boolean married = dto.isMarried();
		boolean work = dto.isWorking();
		String company = dto.getCompanyName();
		double salary = dto.getSalary();
		int age = dto.getAge();
		int exp = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long adharNo = dto.getAdharNo();
		long bankNo = dto.getBankAcNO();
		if (id > 1 && id < 10000) {
			System.out.println("Person ID is valid");
			if (name != null && name.length() > 3 && name.length() < 15) {
				System.out.println("Person Name is valid");
				if (email != null && email.length() > 10 && email.length() < 30) {
					System.out.println("Person Email is valid");
					if (mobileNo > 50000 && mobileNo < 999999999) {
						System.out.println("Person Mobile Number is valid");
						if (gender != null && gender == "male" || gender == "female" || gender == "others") {
							System.out.println("Person Gender is valid");
							if (qualification != null && qualification.length() > 5 && qualification.length() < 15) {
								System.out.println("Person qualification is valid");
								if (married == true || married == false) {
									System.out.println("Person Marriage is valid");
									if (work == true || work == false) {
										System.out.println("Parson Work is valid");
										if (company != null && company.length() > 3 && company.length() < 15) {
											System.out.println("Person company is Valid");
											if (salary > 6000 && salary < 20000000) {
												System.out.println("Person salary is Valid");
												if (age > 18 && age < 38) {
													System.out.println("Person Age is valid");
													if (exp > 2 && exp < 15) {
														System.out.println("Person Exprince is Valid");
														if (location != null && location.length() > 5
																&& location.length() < 20) {
															System.out.println("Person Location is Valid");
															if (city != null && city.length() > 3
																	&& city.length() < 15) {
																System.out.println("Person City is valid");
																if (state != null && state.length() > 3
																		&& state.length() < 15) {
																	System.out.println("Person state is Valid");
																	if (country != null && country.length() > 3
																			&& country.length() < 15) {
																		System.out.println("Person country is Valid");
																		if (adharNo > 1000 && adharNo < 12999999) {
																			System.out
																					.println("Person adharNo is Valid");
																			if (bankNo > 2000 && bankNo < 1000000000) {
																				System.out.println(
																						"Person bankNo is Valid");

																				PersonRepository pr = new PersonRepositoryImp();
																				pr.Save(dto);
																				
																			} else {
																				System.err.println(
																						"Person bankNo is Invalid");
																			}
																		} else {
																			System.err.println(
																					"Person adharNo is Invalid");
																		}
																	} else {
																		System.err.println("Person country is InValid");
																	}
																} else {
																	System.err.println("Person state is InValid");
																}
															} else {
																System.err.println("Person City is Invalid");
															}
														} else {
															System.err.println("Person Location is Invalid");
														}
													} else {
														System.err.println("Person Experiance is Invalid");
													}
												} else {
													System.err.println("Person age is Invalid");
												}
											} else {
												System.err.println("Person salary is invalid");
											}
										} else {
											System.err.println("Person company is Invalid");
										}
									} else {
										System.err.println("Person Work is Invalid");
									}
								}
							} else {
								System.err.println("Person Marriage is Invalid");
							}
						} else {
							System.err.println("Person qualification is Invalid");
						}
					} else {
						System.err.println("Person Gender is Invalid");
					}
				} else {
					System.err.println("Person Mobile is Invalid");
				}
			} else {
				System.err.println("Person Name is valid");
			}
		} else {
			System.err.println("Person ID is Invalid");
		}

		return false;
	}

	@Override
	public void display() {
		System.out.println("Running Display Method");
		PersonRepository pr = new PersonRepositoryImp();
		pr.display();
	}

	@Override
	public void displayAllAgeGreaterThanOrderbyName(int age) {
		System.out.println("display All Age Greater Then OrderBy Name");
		PersonRepository pr = new PersonRepositoryImp();
		pr.displayAllAgeGreaterThenOrderByName(age);
	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
		System.out.println("display All By Gender Desinding Order By Name");
		PersonRepository pr = new PersonRepositoryImp();
		pr.displayAllByGenderDescOrderByName(gender);

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		System.out.println("display All By Salary Greater Than OrderBy Desc");
		PersonRepository pr = new PersonRepositoryImp();
		pr.displayAllBySalaryGreaterThanOrderByDesc(salary);
	}

	@Override
	public void displayCount() {
		System.out.println("display count method");
		PersonRepository pr = new PersonRepositoryImp();
		pr.displayCount();

	}

	@Override
	public void displaySumofSalary() {
		System.out.println("display sum of salary");
		PersonRepository pr = new PersonRepositoryImp();
		pr.displaySumOfSalary();
	}

}
