package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.GardanDTO;
import com.xworkz.jdbc.repository.GardanRepository;
import com.xworkz.jdbc.repository.GardanRepositoryImp;
import com.xworkz.jdbc.service.GardenService;
import com.xworkz.jdbc.service.GardenServiceImp;

public class GardanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GardanDTO gdto = new GardanDTO("Bannerghatta Butterfly Park", "Bannerghatta", 5000, 3000);
		GardanDTO gdto1 = new GardanDTO("JP Park", "JP Nagar", 1000, 800);
		GardanDTO gdto2 = new GardanDTO("Lumbini Gardens", "Nagawara", 70, 80);
		GardanDTO gdto3 = new GardanDTO("M N Krishna Rao Park", "Bangalore bus stand", 2000, 1500);
		GardanDTO gdto4 = new GardanDTO("Lalbagh Botanical Garden", "Lalbagh", 7000, 5000);
		GardanDTO gdto5 = new GardanDTO("Cubbon Park", "Attara Kacheri", 5500, 3500);
		GardanDTO gdto6 = new GardanDTO("Bugle Rock Park", "Bangalore ", 2500, 1700);
		GardanDTO gdto7 = new GardanDTO("Jawaharlal Nehru Park", "Duravani Nagar", 4200, 3200);
		GardanDTO gdto8 = new GardanDTO("Carippa Memorial Park", "Burma bridges", 7000, 4500);
		GardanDTO gdto9 = new GardanDTO("BDA Sculpture Park", "Banashankari", 7800, 4500);
		GardanDTO gdto10 = new GardanDTO("National Military Memorial Park", "Vasanth Nagar", 3000, 2500);
		GardenService gs = new GardenServiceImp();
		gs.validateAndSave(gdto);
		gs.validateAndSave(gdto1);
		gs.validateAndSave(gdto2);
		gs.validateAndSave(gdto3);
		gs.validateAndSave(gdto4);
		gs.validateAndSave(gdto5);
		gs.validateAndSave(gdto6);
		gs.validateAndSave(gdto7);
		gs.validateAndSave(gdto8);
		gs.validateAndSave(gdto9);
		gs.validateAndSave(gdto10);

	}

}
