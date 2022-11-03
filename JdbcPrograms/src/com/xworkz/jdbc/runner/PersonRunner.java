package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.PersonDTO;
import com.xworkz.jdbc.repository.PersonRepository;
import com.xworkz.jdbc.repository.PersonRepositoryImp;
import com.xworkz.jdbc.service.PersonService;
import com.xworkz.jdbc.service.PersonServiceImp;

public class PersonRunner {

	public static void main(String[] args) {

		PersonDTO person = new PersonDTO(10, "ManiPrabha", "prabhamani@gmail.com", 808412874, "male", "Diploma", false,
				true, "BajajCompany", 25000d, 25, 4, "Kengare", "Bangalore", "Karnataka", "India", 14245965l, 12050120l);
		PersonDTO person1 = new PersonDTO(11, "NaveenKumar", "naveenkumar@gmail.com", 741258963, "male",
				"BachulorDegree", false, true, "Infocis", 25000d, 27, 6, "Babaspete", "Nelamangala", "Karnataka",
				"india", 14125763l, 1002152l);
		PersonDTO person2 = new PersonDTO(12, "NageshKoppad", "nagesh.xworkz@gmail.com", 765412385, "male",
				"Engineering", false, true, "InfinitySo", 30000d, 26, 4, "Hubballi", "Bangalore", "Karnataka", "India",
				11212700l, 10513654l);
		PersonDTO person3 = new PersonDTO(13, "Parasuram", "parasuram@gmail.com", 98745632, "male", "Engineer", false,
				true, "inputZero", 30000d, 27, 4, "Hydrabad", "Hydrabad", "Telangana", "India", 10452634l, 43520452l);
		PersonDTO person4 = new PersonDTO(14, "Mahesha", "mahesha.xworkz@gmail.com", 75620052, "male", "Parmacy", false,
				true, "sunform", 40000d, 24, 3, "Jayanagara", "Bangalore", "Karanataka", "India", 1257864l, 1432100l);
		PersonDTO person5 = new PersonDTO(15, "Prashanata", "prashanth@gmail.com", 85632147, "male", "Engineer", false,
				true, "wisdom", 20000d, 28, 5, "ElectronicCity", "Bangalore", "Karnataka", "India", 14523678l,
				3214774l);
		PersonDTO person6 = new PersonDTO(16, "Prajwal", "prajwal@gmail.com", 74521365l, "male", "CivilEng", false,
				true, "CiscoCo", 35000d, 27, 4, "HSRLayout", "Bangalore", "Karntaka", "India", 13145620l, 1236541l);
		PersonDTO person7 = new PersonDTO(17, "RameshNag", "ramesh@gmail.com", 80745210l, "male", "MBBSDoctor", false,
				true, "ramhaiyya Hosp", 80000d, 30, 5, "Mangalore", "Mangalore", "Karnataka", "India", 145266877l,
				1054121l);
		PersonDTO person8 = new PersonDTO(18, "SachinKotin", "sachin@gmail.com", 745632114l, "male", "Engineering",
				false, true, "TCS Company", 400000d, 31, 7, "Channai", "Channai", "Tamil Nadu", "India", 2361022l,
				10544462l);
		PersonDTO person9 = new PersonDTO(19, "Navanitha", "navanitha@gmail.com", 83605421l, "female", "Advacate",
				false, true, "HighCourt", 20000d, 28, 4, "Maleshwaram", "Bangalore", "Karnataka", "India", 51263540l,
				2052365l);
		PersonDTO person10 = new PersonDTO(20, "Yashwanth", "yash.xworkz@gmail.com", 96325874l, "male", "BachulorDegree",
				false, true, "Publisipient", 350000d, 28, 6, "BTM Layout", "Bangalore", "Karnataka", "india", 10523641l,
				121253l);

		PersonService ps = new PersonServiceImp();
		ps.ValidateAndSave(person);
		ps.ValidateAndSave(person1);
		ps.ValidateAndSave(person2);
		ps.ValidateAndSave(person3);
		ps.ValidateAndSave(person4);
		ps.ValidateAndSave(person5);
		ps.ValidateAndSave(person6);
		ps.ValidateAndSave(person7);
		ps.ValidateAndSave(person8);
		ps.ValidateAndSave(person9);
		ps.ValidateAndSave(person10);
//		ps.ValidateAndSave(person11);
//		ps.ValidateAndSave(person12);
//		ps.ValidateAndSave(person13);
//		ps.ValidateAndSave(person14);
//		ps.ValidateAndSave(person15);
//		ps.ValidateAndSave(person16);
//		ps.ValidateAndSave(person17);
//		ps.ValidateAndSave(person18);
//		ps.ValidateAndSave(person19);
//		ps.ValidateAndSave(person20);
//		ps.ValidateAndSave(person21);
//		ps.ValidateAndSave(person22);
//		ps.ValidateAndSave(person23);
//		ps.ValidateAndSave(person24);
//		ps.ValidateAndSave(person25);
//
		PersonService psi = new PersonServiceImp();
		psi.display();
		System.out.println("-----------------------");
		psi.displayAllAgeGreaterThanOrderbyName(23);
		System.out.println("+++++++++++++++++++++");
		psi.displayAllByGenderDescOrderByName("");
		System.out.println("---------------------");
		psi.displayAllBySalaryGreaterThanOrderByDesc(250000);
		System.out.println("=====================");
		psi.displayCount();
		System.out.println("..................");
		psi.displaySumofSalary();
	}

}
