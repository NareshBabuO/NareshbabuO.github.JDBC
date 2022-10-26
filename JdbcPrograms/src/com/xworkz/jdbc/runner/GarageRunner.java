package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.GarageDTO;
import com.xworkz.jdbc.service.GarageService;
import com.xworkz.jdbc.service.GarageServiceImp;

public class GarageRunner {

	public static void main(String[] args) {

		
		
		GarageDTO garageDTO6= new GarageDTO("Naresh AutoMobiles", "Tumkur", "Bike", 3000);
		GarageDTO garageDTO7= new GarageDTO("Sachin AutoMobiles", "Ramdurga", "Bike&Cars", 5000);
		GarageDTO garageDTO8= new GarageDTO("Chandru Mechanics", "Chitradurga", "2Wheelers", 2000);
		GarageDTO garageDTO9= new GarageDTO("Prajwal AutoMobiles", "Hubbali", "Bike&Cars", 4000);
		GarageDTO garageDTO10= new GarageDTO("Basu AutoMobiles", "Raichur", "4Wheelers", 3500);
		GarageDTO garageDTO11 = new GarageDTO("Abhishesk Automobile", "Belagavi", "BothBike&Cars", 7000);
		GarageService gs=new GarageServiceImp();
		gs.validdateAndSave(garageDTO6);
		gs.validdateAndSave(garageDTO7);
		gs.validdateAndSave(garageDTO8);
		gs.validdateAndSave(garageDTO9);
		gs.validdateAndSave(garageDTO10);
		gs.validdateAndSave(garageDTO11);	
	}

}
