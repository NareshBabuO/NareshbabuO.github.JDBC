package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.service.HospitalService;
import com.xworkz.jdbc.service.HospitalServiceImp;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO1 = new HospitalDTO(1, "Java Deva", "Cardiac", "CN Manjunath", 1970);
		HospitalDTO hospitalDTO2 = new HospitalDTO(2, "Ayu Health", "GENERAL(EXCL. DENTAL)", " Dr. Om Prakash Agrawal",
				1998);
		HospitalDTO hospitalDTO3 = new HospitalDTO(3, "Fortis", "General", "Shivinder Mohan Singh", 1996);
		HospitalDTO hospitalDTO4 = new HospitalDTO(4, "Apollo Hospitals", "General", "Dr. Prathap C. Reddy ", 1983);
		HospitalDTO hospitalDTO5 = new HospitalDTO(5, "Victoria Bangalore Hospital ", "General",
				"Shri Krishnaraja Wodeyar", 1901);
		HospitalDTO hospitalDTO6 = new HospitalDTO(6, "Manipal", "General(Multispeciality)", "Ranjan Pai", 1991);
		HospitalDTO hospitalDTO7 = new HospitalDTO(7, "HGC Cancer", "Cancer", "BS Ajai Kumar", 1989);
		HospitalDTO hospitalDTO8 = new HospitalDTO(8, "Sakra World Hospital", "Multispeciality", "Naoya Matsumi", 2014);
		HospitalDTO hospitalDTO9 = new HospitalDTO(9, "Hosmat Hospittal", "Tertiary Care Hospital", "Dr.Thomas Chandy",
				2002);
		HospitalDTO hospitalDTO10 = new HospitalDTO(10, "Milaan Fertility", "Infertility", "Dr. Kamini A. Rao", 1990);
		HospitalDTO hospitalDTO11 = new HospitalDTO(11, "Sri sairam Hospital", "Multispeciality", "Gina Bruno", 2004);
		HospitalDTO hospitalDTO12 = new HospitalDTO(12, "Vignan General Hospital", "genral ", "Dr Vignan", 2013);
		HospitalDTO hospitalDTO13 = new HospitalDTO(13, "BGS Global Hospital", "multispeciality ", "Dr K Ravindranath",
				1999);
		HospitalDTO hospitalDTO14 = new HospitalDTO(14, "Narayana Multispeciality Hospital", "multispeciality ",
				"Devi Prasad Shetty", 2000);
		HospitalDTO hospitalDTO15 = new HospitalDTO(15, "Sagar Hospital", "multi-speciality tertiary care",
				"D Hemachandra Sagar", 2002);
		HospitalDTO hospitalDTO16 = new HospitalDTO(16, "Kauvery Hospital", "Multispeciality",
				"Dr. Manivannan Selvaraj", 2002);
		HospitalDTO hospitalDTO17 = new HospitalDTO(17, "United Hospital", "Comprehensive Tertiary",
				"Dr. Vikram S Siddareddy", 2012);
		HospitalDTO hospitalDTO18 = new HospitalDTO(18, "Lenus Hospital", "Multispeciality Surgical", "Ramesh S M",
				2018);
		HospitalDTO hospitalDTO19 = new HospitalDTO(19, "Omega Multispeciality Hospital", "Multispeciality",
				"Peddireddy Sridhar", 2010);
		HospitalDTO hospitalDTO20 = new HospitalDTO(20, "Medstar Hospital", "multi-specialty Hospitals",
				"Chikkalingaiah", 1998);
		HospitalDTO hospitalDTO21 = new HospitalDTO(21, "The life Plus Hospital", "multi-specialty Hospitals",
				" Dr shekhar Reddy", 2000);
		HospitalDTO hospitalDTO22 = new HospitalDTO(22, "Altius Hospital", "Multispeciality Hospital",
				"Dr Ramesh Bettaiah", 2010);
		HospitalDTO hospitalDTO23 = new HospitalDTO(23, "Marvel Multispeciality Hospital", "Multispeciality Hospital",
				"Ravishankar Reddy", 2018);
		HospitalDTO hospitalDTO24 = new HospitalDTO(24, "Aksha Hospital", "Heart", "Dr. Madhuri Sumanth.", 2015);
		HospitalDTO hospitalDTO25 = new HospitalDTO(25, "Practo Hospital", "healthcare", "Shashank ND", 2008);
		HospitalDTO hospitalDTO26 = new HospitalDTO(26, "South city Hospital", "Multispeciality", "Roshan Dath", 2004);
		HospitalDTO hospitalDTO27 = new HospitalDTO(27, "Sparsh Hospital", "women and children care",
				"Sharan Shivraj Patil", 2006);
		HospitalDTO hospitalDTO28 = new HospitalDTO(28, "Santhosh Hospital", "Super Speciality", "Paramasivam", 1984);
		HospitalDTO hospitalDTO29 = new HospitalDTO(29, "Pathway Hospital", "Comprehensive healthcare",
				"Avijit Banerjee and Arpitha Nagaraj.", 2021);
		HospitalDTO hospitalDTO30 = new HospitalDTO(30, "Jyothsna Hospital", "Anesthesiology & Pain Management ",
				"Dr. Y Raghavendra Reddy", 2020);
		HospitalDTO hospitalDTO31 = new HospitalDTO(31, "Phoenix Hospital", "multi-specialty", "Dr. B.M Seshadri",
				2018);
		HospitalDTO hospitalDTO32 = new HospitalDTO(32, "KK Hospital", "General Ward", "Rajendra Singh", 1992);
		HospitalDTO hospitalDTO33 = new HospitalDTO(33, "Ayyansh Hospital", "Multi-Speciality", "Dr P S Rao", 2010);
		HospitalDTO hospitalDTO34 = new HospitalDTO(34, "Sonu Hospital", "Multispeciality", "Dr. Monika Sonu", 2021);
		HospitalDTO hospitalDTO35 = new HospitalDTO(35, "Altius Hospital", "multi-specialty", "Dr Ramesh Bettaiah",
				2010);
		HospitalDTO hospitalDTO36 = new HospitalDTO(36, "Motherhood Hospital", "speciality hospital chain",
				"Rehan Sayeed", 2008);
		HospitalDTO hospitalDTO37 = new HospitalDTO(37, "NU Hospital", "kidney hospitals", "Venkatesh", 1999);
		HospitalDTO hospitalDTO38 = new HospitalDTO(38, "People Hospital", "tertiary care unit", "Dr Jothi Neeraja",
				2013);
		HospitalDTO hospitalDTO39 = new HospitalDTO(39, "Narayana Hospital", "Cardiac", "Devi Prasad Shetty", 2000);
		HospitalDTO hospitalDTO40 = new HospitalDTO(40, "Sanjeevini Hospital", "multi-speciality",
				"Dr. Subhash K Reddy", 2016);
		HospitalDTO hospitalDTO41=new HospitalDTO(41,"columbia Asia","General","Dr.Chan Boon Kheng",1996);
		HospitalDTO hospitalDTO42=new HospitalDTO(42,"Indira Gandhi","Childern","State Govt",1960);
		HospitalDTO hospitalDTO43=new HospitalDTO(43,"Rajiv Gandhi","Cardio","State Govt",1996);
		HospitalDTO hospitalDTO44=new HospitalDTO(44,"Sanjay Gandhi","General","State Govt",1996);
		HospitalDTO hospitalDTO45=new HospitalDTO(45,"Narayana Hrudayalaya","Cardio","Devi Shetty",2001);
		HospitalDTO hospitalDTO46=new HospitalDTO(46,"Vanivilas","women","Rama Shetty",1957);
		HospitalDTO hospitalDTO47=new HospitalDTO(47,"Victoria","General","Shri KrishnaRaja Wodeyar",1900);
		HospitalDTO hospitalDTO48=new HospitalDTO(48,"Kasturba","General","Malathi",1980);
		HospitalDTO hospitalDTO49=new HospitalDTO(49,"A V hospital","General","Anuradha",2003);
		HospitalDTO hospitalDTO50=new HospitalDTO(50,"Forties","General","Fortis Escorts",1996);
		HospitalDTO hospitalDTO51=new HospitalDTO(51,"Aster","General","Azad Moopen",1987);
		HospitalDTO hospitalDTO52=new HospitalDTO(52,"Amala","Cancer","Kuriakose Elias Charvara",1978);
		HospitalDTO hospitalDTO53=new HospitalDTO(53, "Jaya Dev", "Cardio ", "C N Manjunath", 1972);
		HospitalDTO hospitalDTO54=new HospitalDTO(54,"Kidwai","oncology","RaviVarma",1948);
		HospitalDTO hospitalDTO55=new HospitalDTO(55,"Nimhans","Neuro","Mari Gowda",1974);
		HospitalDTO hospitalDTO56=new HospitalDTO(56,"St.John","General","Catholic Bishops",1963);
		HospitalDTO hospitalDTO57=new HospitalDTO(57,"Apollo","General","Prathap Reddy",1983);
		HospitalDTO hospitalDTO58=new HospitalDTO(58,"Bowring","General","Jhon Bowring",1943);
		HospitalDTO hospitalDTO59 = new HospitalDTO(59, "Shirdartha Hospital", "General Ward", "Rajeev shidartha", 1992);
		HospitalDTO hospitalDTO60 = new HospitalDTO(60, "Shidanganga Hospital", "Multi-Speciality", "Dr shidarth", 2019);
		HospitalDTO hospitalDTO61 = new HospitalDTO(61, "Soniya Hospital", "Multispeciality", "Dr. Monika Soniya", 2018);
		HospitalDTO hospitalDTO62 = new HospitalDTO(62, "Altius ", "Kidney", "Ramesh Bettaiah",
				2007);
		HospitalDTO hospitalDTO63 = new HospitalDTO(63, "City Hospital", "K.Bhaskar", "dynamic surgeon",1975);
		HospitalDTO hospitalDTO64 = new HospitalDTO(64, "D.G.Hospital", "D.G Benakappa","Surgeon",1985);

		HospitalDTO hospitalDTO65 = new HospitalDTO(65, "Basaveshwara General Hospital ","Mahadevappa Rampure",
				"radiology",2001);
		HospitalDTO hospitalDTO66 = new HospitalDTO(66, "Vydehi Hospital", "D.K Audikeshav naidu","NeuroSurgey",2000);

		HospitalService hs = new HospitalServiceImp();
		hs.vaildateAndSave(hospitalDTO1);
		hs.vaildateAndSave(hospitalDTO2);
		hs.vaildateAndSave(hospitalDTO3);
		hs.vaildateAndSave(hospitalDTO4);
		hs.vaildateAndSave(hospitalDTO5);
		hs.vaildateAndSave(hospitalDTO6);
		hs.vaildateAndSave(hospitalDTO7);
		hs.vaildateAndSave(hospitalDTO8);
		hs.vaildateAndSave(hospitalDTO9);
		hs.vaildateAndSave(hospitalDTO10);
		hs.vaildateAndSave(hospitalDTO11);
		hs.vaildateAndSave(hospitalDTO12);
		hs.vaildateAndSave(hospitalDTO13);
		hs.vaildateAndSave(hospitalDTO14);
		hs.vaildateAndSave(hospitalDTO15);
		hs.vaildateAndSave(hospitalDTO16);
		hs.vaildateAndSave(hospitalDTO17);
		hs.vaildateAndSave(hospitalDTO18);
		hs.vaildateAndSave(hospitalDTO19);
		hs.vaildateAndSave(hospitalDTO20);
		hs.vaildateAndSave(hospitalDTO21);
		hs.vaildateAndSave(hospitalDTO22);
		hs.vaildateAndSave(hospitalDTO23);
		hs.vaildateAndSave(hospitalDTO24);
		hs.vaildateAndSave(hospitalDTO25);
		hs.vaildateAndSave(hospitalDTO26);
		hs.vaildateAndSave(hospitalDTO27);
		hs.vaildateAndSave(hospitalDTO28);
		hs.vaildateAndSave(hospitalDTO29);
		hs.vaildateAndSave(hospitalDTO30);
		hs.vaildateAndSave(hospitalDTO31);
		hs.vaildateAndSave(hospitalDTO32);
		hs.vaildateAndSave(hospitalDTO33);
		hs.vaildateAndSave(hospitalDTO34);
		hs.vaildateAndSave(hospitalDTO35);
		hs.vaildateAndSave(hospitalDTO36);
		hs.vaildateAndSave(hospitalDTO37);
		hs.vaildateAndSave(hospitalDTO38);
		hs.vaildateAndSave(hospitalDTO39);
		hs.vaildateAndSave(hospitalDTO40);
		hs.vaildateAndSave(hospitalDTO41);
		hs.vaildateAndSave(hospitalDTO42);
		hs.vaildateAndSave(hospitalDTO43);
		hs.vaildateAndSave(hospitalDTO44);
		hs.vaildateAndSave(hospitalDTO45);
		hs.vaildateAndSave(hospitalDTO46);
		hs.vaildateAndSave(hospitalDTO47);
		hs.vaildateAndSave(hospitalDTO48);
		hs.vaildateAndSave(hospitalDTO49);
		hs.vaildateAndSave(hospitalDTO50);
		hs.vaildateAndSave(hospitalDTO51);
		hs.vaildateAndSave(hospitalDTO52);
		hs.vaildateAndSave(hospitalDTO53);
		hs.vaildateAndSave(hospitalDTO54);
		hs.vaildateAndSave(hospitalDTO55);
		hs.vaildateAndSave(hospitalDTO56);
		hs.vaildateAndSave(hospitalDTO57);
		hs.vaildateAndSave(hospitalDTO58);
		hs.vaildateAndSave(hospitalDTO59);
		hs.vaildateAndSave(hospitalDTO60);
		hs.vaildateAndSave(hospitalDTO61);
		hs.vaildateAndSave(hospitalDTO62);
		hs.vaildateAndSave(hospitalDTO63);
		hs.vaildateAndSave(hospitalDTO64);
		hs.vaildateAndSave(hospitalDTO65);
		hs.vaildateAndSave(hospitalDTO66);
	}

}
