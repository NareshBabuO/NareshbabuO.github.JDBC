package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.PropertyDTO;
import com.xworkz.jdbc.service.PropertySerivceImp;
import com.xworkz.jdbc.service.PropertyService;

public class PropertyRunner {

	public static void main(String[] args) {

		PropertyDTO propertyDTO = new PropertyDTO(1043, "Naresh", "Bangalore", 2500000);
		PropertyDTO propertyDTO1 = new PropertyDTO(227, "Mahesh", "Koratagere", 750000);
		PropertyDTO propertyDTO2 = new PropertyDTO(347, "Naveen", "Ramnagar", 450000);
		PropertyDTO propertyDTO3 = new PropertyDTO(727, "Chandru", "Mangalore", 500000);
		PropertyDTO propertyDTO4 = new PropertyDTO(328, "Nandan", "Mysore", 305000);
		PropertyDTO propertyDTO5 = new PropertyDTO(252, "Sumeeth", "Bidharraj", 145200);
		PropertyDTO propertyDTO6 = new PropertyDTO(587, "Lingaraju", "Chitradurga", 740140);
		PropertyService ps = new PropertySerivceImp();
		ps.validdateANdSave(propertyDTO);
		ps.validdateANdSave(propertyDTO1);
		ps.validdateANdSave(propertyDTO2);
		ps.validdateANdSave(propertyDTO3);
		ps.validdateANdSave(propertyDTO4);
		ps.validdateANdSave(propertyDTO5);
		ps.validdateANdSave(propertyDTO6);

	}

}
