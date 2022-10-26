package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.PersonDTO;
import com.xworkz.jdbc.repository.PersonRepository;
import com.xworkz.jdbc.repository.PersonRepositoryImp;
import com.xworkz.jdbc.service.PersonService;
import com.xworkz.jdbc.service.PersonServiceImp;

public class PersonRunner {

	public static void main(String[] args) {

		PersonDTO person = new PersonDTO(10, "ManiPrabha", "prabhamani@gmail.com", 808412874, "male", "Diploma", false,
				true, "BajajCompany", 25000, 25, 4, "Kengare", "Bangalore", "Karnataka", "India", 7842, 12050);

		PersonDTO person1 = new PersonDTO(11, "Nandan", "nandankumar@gmail.com", 735388745, "male", "MasterCA", false,
				true, "OSGCompany", 60000, 24, 3, "Electronic City", "Bangalore", "Karnataka", "India", 1452366,
				1254632);

		PersonDTO person2 = new PersonDTO(12, "Nagesh", "nageshkumar@gmail.com", 735382154, "male", "Engineer", false,
				true, "NandeCompany", 30000, 27, 2, "Electronic City", "Bangalore", "Karnataka", "India", 874512215,
				5463221);

		PersonDTO person3 = new PersonDTO(13, "Mahesh", "maheshmahi@gmail.com", 895632147, "male", "Pharmacy", false,
				true, "Sunflower", 20000, 23, 5, "Jayanagar", "Bangalore", "Karnataka", "India", 12546328, 14524366);

		PersonDTO person4 = new PersonDTO(14, "Dyamanna", "dyams.Xworkz@gmail.com", 749652344, "male", "Engineer",
				false, true, "inputZero", 30000, 26, 4, "Hebbali", "Bangalore", "Karnataka", "India", 452536685,
				25544632);

		PersonDTO person5 = new PersonDTO(15, "DadaSaheb", "dadasaheb.xworkz@gmail.com", 96325874, "male",
				"BachulorsCA", false, true, "InfinitySolutions", 25000, 28, 4, "Koramangala", "Bangalore", "Karnataka",
				"India", 89562354, 54114632);

		PersonDTO person6 = new PersonDTO(16, "Sachinkotin", "sachinkotin.xworkz@gmail.com", 874563245, "male",
				"Engineer", false, true, "Infosis", 27000, 29, 7, "NaviMumbai", "Mumbai", "Maharastra", "India",
				10002547, 96325874);

		PersonDTO person7 = new PersonDTO(17, "Santhosh", "santhosh.xworkz@gmail.com", 785563245, "male", "Engineer",
				false, true, "Greentech", 37000, 27, 5, "navadehli", "NewDehli", "Dehli", "India", 230002547, 37525874);

		PersonDTO person8 = new PersonDTO(18, "Malthesh", "malthesh.xworkz@gmail.com", 974563245, "male", "Engineer",
				false, true, "TCSCompany", 25000, 25, 3, "HSRLayout", "Bangalore", "Karnataka", "India", 257002547,
				346325874);

		PersonDTO person9 = new PersonDTO(19, "Prajwal", "prajwal.xworkz@gmail.com", 784563245, "male", "Engineer",
				false, true, "Infinity", 36000, 26, 3, "Noida", "Noida", "Utharpradesh", "India", 17602547, 301435874);

		PersonDTO person10 = new PersonDTO(20, "Prashanth", "prashanth.xworkz@gmail.com", 974563245, "male", "Engineer",
				false, true, "mountblue", 40000, 31, 6, "Tiruvanam", "Turuvanantauram", "Kerala", "India", 1060652547,
				674525874);

		PersonDTO person11 = new PersonDTO(21, "Parashuram", "parashuram.xworkz@gmail.com", 785563245, "male",
				"Engineer", false, true, "publisipient", 50000, 26, 3, "Electronic City", "Bangalore", "Karnataka",
				"India", 10302547, 42525874);

		PersonDTO person12 = new PersonDTO(22, "ChandraShekar", "chandru.xworkz@gmail.com", 875613783, "male",
				"Engineer", false, true, "Ravidrabharati", 27000, 25, 4, "Jayanagar", "Bangalore", "Karnataka", "India",
				20302547, 1036325874);

		PersonDTO person13 = new PersonDTO(23, "vishal", "vishal12445@gmail.com", 874521, "male", "B.com", false, true,
				"wipro", 25000, 23, 2, "hubli", "hubli", "karnataka", "india", 1125312l, 11223788l);

		PersonDTO person14 = new PersonDTO(24, "soumya", "sahana12445@gmail.com", 84150135l, "female", "Engineering",
				false, true, "infosys", 200000, 21, 3, "gokak", "Belgaum", "karnataka", "india", 1241125312l,
				3654222788l);

		PersonDTO person15 = new PersonDTO(25, "yashnagraj", "Rockin2445@gmail.com", 841554832l, "male", "Engineering",
				false, true, "Securiteam", 200000, 33, 8, "haveri", "haveri", "karnataka", "india", 10121247412l,
				8521422788l);

		PersonDTO person16 = new PersonDTO(26, "Vignesh", "goldenstarv@gmail.com", 95120135l, "male", "Engineering",
				false, true, "Microsoft Corporation", 200000, 31, 6, "gokak", "Belgaum", "karnataka", "india",
				524124185312l, 10362412774l);

		PersonDTO person17 = new PersonDTO(27, "sahanapatil", "sahana12445@gmail.com", 941501358l, "female",
				"Engineering", false, true, "DXCCompany", 300000, 27, 5, "bhidar", "bhidar", "karnataka", "india",
				10362412774l, 524124185312l);

		PersonDTO person18 = new PersonDTO(28, "dhananjay", "dollysahana12445@gmail.com", 841501346l, "male",
				"Engineering", false, true, "infosys", 200000, 22, 1, "gokak", "Belgaum", "karnataka", "india",
				5312146124112l, 12412774036l);

		PersonDTO person19 = new PersonDTO(29, "Nayana", "Nayana.xworkz@gmail.com", 85214763, "female", "Engineering",
				false, true, "SAPCompany", 200000, 28, 6, "gokak", "Belgaum", "karnataka", "india", 12412774036l,
				5312146124112l);

		PersonDTO person20 = new PersonDTO(30, "Prerana", "prerana12445@gmail.com", 984150135l, "female", "Engineering",
				false, true, "infosys", 200000, 29, 7, "bellary", "Ballary", "karnataka", "india", 12531211241l,
				14653124212l);

		PersonDTO person21 = new PersonDTO(31, "sahana", "sahana12445@gmail.com", 89550135l, "female", "Engineering",
				false, true, "Accenture", 200000, 23, 2, "gokak", "Belgaum", "karnataka", "india", 14653124212l,
				1254365788l);
		PersonDTO person22 = new PersonDTO(32, "Ramesh", "ramesh.xworkz@gmail.com", 84150135l, "male", "Engineering",
				false, true, "infosys", 70000, 28, 3, "Mysore", "Mysore", "karnataka", "india", 1254365765l,
				13653124218l);

		PersonDTO person23 = new PersonDTO(33, "Gopika", "Gopika1982@gmail.com", 954150135l, "female", "Engineering",
				false, true, "infosys", 50000, 35, 12, "gokak", "Belgaum", "karnataka", "India", 1461241125312l,
				25522522788l);

		PersonDTO person24 = new PersonDTO(34, "darshan", "challanging12445@gmail.com", 92554135l, "male", "Mtech",
				false, true, "TCSCompany", 152000, 32, 7, "Sagar", "Shivmogga", "karnataka", "india", 4114612121253l,
				227412788l);
		PersonDTO person25 = new PersonDTO(35, "soumya", "sahana12445@gmail.com", 5484150135l, "female", "Engineering",
				false, true, "infosys", 25000, 27, 6, "ElectronicCity", "Bangalore", "Karnataka", "India", 2574212411l,
				27882222788l);

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
		ps.ValidateAndSave(person11);
		ps.ValidateAndSave(person12);
		ps.ValidateAndSave(person13);
		ps.ValidateAndSave(person14);
		ps.ValidateAndSave(person15);
		ps.ValidateAndSave(person16);
		ps.ValidateAndSave(person17);
		ps.ValidateAndSave(person18);
		ps.ValidateAndSave(person19);
		ps.ValidateAndSave(person20);
		ps.ValidateAndSave(person21);
		ps.ValidateAndSave(person22);
		ps.ValidateAndSave(person23);
		ps.ValidateAndSave(person24);
		ps.ValidateAndSave(person25);
		
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
