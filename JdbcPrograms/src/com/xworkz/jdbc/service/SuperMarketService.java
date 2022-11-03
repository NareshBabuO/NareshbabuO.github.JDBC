package com.xworkz.jdbc.service;

import java.util.List;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.dto.SuperMarketDTO;

public interface SuperMarketService {

	boolean validateAndSave(SuperMarketDTO dto);

	void displayByName(String name);

	boolean validateAndSave(List<SuperMarketDTO> list);

	default SuperMarketDTO findByName(String name) {
		return null;
	}

	default SuperMarketDTO findByID(int id) {
		return null;
	}

	List<SuperMarketDTO> findAll();

	List<SuperMarketDTO> findBytype(String type);

	List<SuperMarketDTO> findByGstNoAndType(long gstNo, String type);

}
