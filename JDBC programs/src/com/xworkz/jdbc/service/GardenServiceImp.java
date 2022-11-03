package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.GardanDTO;
import com.xworkz.jdbc.repository.GardanRepository;
import com.xworkz.jdbc.repository.GardanRepositoryImp;

public class GardenServiceImp implements GardenService {

	@Override
	public boolean validateAndSave(GardanDTO dto) {
		System.out.println("Starting/Checking validation");
		String name = dto.getName();
		String area = dto.getArea();
		int tree = dto.getTotalTree();
		int beanch = dto.getTotalBeanch();
		if (name != null && name.length() > 5 && name.length() < 50) {
			System.out.println("Name is valid");
			if (area != null && area.length() > 5 && area.length() < 1000) {
				System.out.println("Area is valid");
				if (tree > 5 && tree < 8000) {
					System.out.println("Trees are valid");
					if (beanch > 5 && beanch < 6000) {
						System.out.println("Beanch is Valid");
						GardanRepository gr = new GardanRepositoryImp();
						gr.Save(dto);

					} else {
						System.err.println("Beanch is not valid");
					}
				} else {
					System.err.println("Tree is npt Valid");
				}
			} else {
				System.err.println("Area is not valid");
			}
		} else {
			System.err.println("Name is not Valid");
		}
		return false;
	}
}
