package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.repository.HospitalRepository;
import com.xworkz.jdbc.repository.HospitalRepositoryImp;

public class HospitalServiceImp implements HospitalService {

	@Override
	public boolean vaildateAndSave(HospitalDTO dto) {
		System.out.println("validation check stated");
		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		String spe = dto.getSpecialist();
		int since = dto.getSince();
		if (id > 0 && id < 5000) {
			System.out.println("Hospital id is valid");
			if (name != null && name.length() > 5 && name.length() < 100) {
				System.out.println("Hospital name is valid");
				if (founder != null && founder.length() > 3 && founder.length() < 300) {
					System.out.println("Founder is valid");
					if (spe != null && spe.length() > 3 && spe.length() < 300) {
						System.out.println("Hospital Specialist is valid");
						if (since > 1800 && since < 2023) {
							System.out.println("Hospital since is valid");
							System.out.println("All properties are valid ,can save into repository ");
							HospitalRepository hr = new HospitalRepositoryImp();
							hr.save(dto);
						} else {
							System.err.println("since is invalid");
						}
					} else {
						System.err.println("Specialist is valid");
					}
				} else {
					System.err.println("Founder is inValid");
				}
			} else {
				System.out.println("Name is inValid");
			}
		} else {
			System.err.println("ID is Invalid");
		}
		return false;
	}

}
