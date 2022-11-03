package com.xworkz.jdbc.service;

import java.util.List;

import com.xworkz.jdbc.dto.SuperMarketDTO;
import com.xworkz.jdbc.repository.SuperMarketRepository;
import com.xworkz.jdbc.repository.SuperMarketRepositoryImp;

public class SuperMarketServiceImp implements SuperMarketService {

	SuperMarketRepository repository = new SuperMarketRepositoryImp();

	public SuperMarketServiceImp() {
		System.out.println("SuperMarketServiceImp Checking" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(SuperMarketDTO dto) {

		System.out.println("Checking validdateBySave");
		int id = dto.getId();
		String name = dto.getName();
		long gstNo = dto.getGstNo();
		String type = dto.getType();

		if (id > 10 && id < 1000) {
			System.out.println("SuperMarket ID is valid");
			if (name != null && name.length() > 5 && name.length() < 30) {
				System.out.println("SuperMarket Name is Valid");
				if (gstNo > 100000 && gstNo < 9999999999l) {
					System.out.println("Supermarket GSTNo Valid");
					if (type != null && type.length() > 5 && type.length() < 30) {
						System.out.println("SuperMarket type is Valid");
						System.out.println("All Properties are Valid");
						repository.save(dto);
					} else {
						System.out.println("SuperMarket Type is Invalid ");
					}
				} else {
					System.out.println("SuperMarket GSTNo Invalid  ");
				}
			} else {
				System.out.println("SuperMarket name is Invalid");
			}
		}
		return true;
	}

	@Override
	public void displayByName(String name) {
		System.out.println("DisplayByName Method is Running ");
		this.repository.displayByName(name);

	}

	@Override
	public boolean validateAndSave(List<SuperMarketDTO> list) {
		System.out.println("Validating and Saving the data using List");
		this.repository.save(list);
		return true;

	}

	@Override
	public SuperMarketDTO findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<SuperMarketDTO> findAll() {
		return repository.findAll();
	}

	@Override
	public List<SuperMarketDTO> findBytype(String type) {
		return repository.findByType(type);
	}

	@Override
	public List<SuperMarketDTO> findByGstNoAndType(long gstNo, String type) {
		return repository.findByGstNoAndType(type, 0);
	}

	public int totalCount() {

		return repository.totalCount();
	}

}
