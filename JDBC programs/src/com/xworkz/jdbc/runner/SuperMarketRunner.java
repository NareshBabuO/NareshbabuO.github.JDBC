package com.xworkz.jdbc.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.jdbc.dto.SuperMarketDTO;
import com.xworkz.jdbc.service.SuperMarketService;
import com.xworkz.jdbc.service.SuperMarketServiceImp;

public class SuperMarketRunner {

	public static void main(String[] args) {

		SuperMarketDTO smd = new SuperMarketDTO(102, "Reliance", "RelianceCo", 17226l, "Holesale&Retailer");
		SuperMarketDTO smd1 = new SuperMarketDTO(107, "Bigbajar", "BugBajarCo", 13270l, "HoleSale");
		SuperMarketDTO smd2 = new SuperMarketDTO(109, "Ashirwad", "AshirwadCo", 14520l, "in-storeshoping");
		SuperMarketDTO smd3 = new SuperMarketDTO(114, "GreenLand", "GreenLand", 15620l, "MRpSales");
		SuperMarketDTO smd4 = new SuperMarketDTO(123, "MoreSuperM", "MoreShopingCo", 15210l, "Holesale&Retailer");
		SuperMarketDTO smd5 = new SuperMarketDTO(125, "LuluMall", "LuluGroup", 13654l, "Holesale&Retailer");

//		
//		SuperMarketService sms = new SuperMarketServiceImp();
//		sms.validateAndSave(smd);
//		sms.validateAndSave(smd1);
//		sms.validateAndSave(smd2);
//		sms.validateAndSave(smd3);
//		sms.validateAndSave(smd4);
//		sms.validateAndSave(smd5);
//
//		sms.displayByName("LuluMall");

		List<SuperMarketDTO> collection = new ArrayList();
		collection.add(smd);
		collection.add(smd1);
		collection.add(smd2);
		collection.add(smd3);
		collection.add(smd4);
		collection.add(smd5);

		// collection.stream().forEach(ref->System.out.println(sms.validateAndSave(ref)));

		SuperMarketService sms = new SuperMarketServiceImp();
		
		SuperMarketDTO findName = sms.findByName("GreenLand");
		System.out.println(findName);
		System.out.println("-----------------");
		
		SuperMarketDTO findbyId = sms.findByID(1);
		System.out.println(findbyId);
		System.out.println("================");

		List<SuperMarketDTO> listFindAll = sms.findAll();
		System.out.println(listFindAll);
		System.out.println("++++++++++++++++++++++++");

		List<SuperMarketDTO> ltType = sms.findBytype("HoleSale");
		System.out.println(ltType);
		System.out.println("...............");

		List<SuperMarketDTO> lt = sms.findByGstNoAndType(17895620l, "MRpSales");
		System.out.println(lt);
	}

}
