package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.PropertyDTO;
import com.xworkz.jdbc.repository.PropertyRepository;
import com.xworkz.jdbc.repository.PropertyRepositoryImpl;

public class PropertySerivceImp implements PropertyService {

	@Override
	public boolean validdateANdSave(PropertyDTO dto) {

		System.out.println("Checking validation service");
		int site = dto.getSiteNo();
		String owner = dto.getOwner();
		String area = dto.getArea();
		double cost = dto.getCost();
		if (site > 202 && site < 50000) {
			System.out.println("Property site valid"+site);
			if (owner != null && owner.length() > 5 && owner.length() < 30) {
				System.out.println("Property Owner is valid"+owner);
				if (area != null && area.length() > 3 && area.length() < 40) {
					System.out.println("Property Area is Valid"+area);
					if (cost > 150000 && cost < 100000000) {
						System.out.println("Property Cost is vaild"+cost);
						PropertyRepository pr = new PropertyRepositoryImpl();
						pr.save(dto);
					} else {
						System.err.println("Property cost is inValid");
					}
				} else {
					System.err.println("Property Area is Invalid");
				}
			} else {
				System.err.println("Property Owner is Invalid");
			}
		} else {
			System.err.println("Property Site is Invalid");
		}

		return false;
	}
}
