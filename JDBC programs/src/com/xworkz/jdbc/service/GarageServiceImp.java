package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.GarageDTO;
import com.xworkz.jdbc.repository.GarageRepository;
import com.xworkz.jdbc.repository.GarageRepositoryImp;

public class GarageServiceImp implements GarageService {

	@Override
	public boolean validdateAndSave(GarageDTO dto) {
		System.out.println("Checking Validation");
		String name=dto.getName();
		String type=dto.getType();
		String loc=dto.getLocation();
		int cost=dto.getCost();
		if(name !=null && name.length()>5 && name.length()<400) {
			System.out.println("Name is vaild in Garage"); 
			if(type !=null && type.length()>3 && type.length()<50) {
				System.out.println("Type is valid in Garage");
				if(loc !=null && loc.length()>5 && loc.length()<400) {
					System.out.println("Location is valid");
					if(cost>0 && cost<4500000) {
						System.out.println("Cost is valid in Garage");
						GarageRepository ge = new GarageRepositoryImp();
						ge.save(dto);
					}
					else {
						System.err.println("Cost is invalid");
					}
				}
					else {
						System.err.println("Location is invalid");
					}
				}else {
					System.err.println("Type is invalid");
				}
			}
		else {
				System.err.println("Name is invalid in Garage");
			}
			
		return false;
	}

}
