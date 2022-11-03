package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.PersonDTO;
import com.xworkz.jdbc.service.PersonService;

public class PersonRepositoryImp implements PersonRepository {

	public PersonRepositoryImp() {
		System.out.println("PersonRepository with default Const.." + getClass().getSimpleName());
	}

	@Override
	public boolean Save(PersonDTO dto) {
		System.out.println("Running Save Method");

		try (Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
				JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String mysqlValues = "insert into xworkzbtm.person values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getEmail() + "'," + dto.getMobileNo() + ",'" + dto.getGender() + "','"
					+ dto.getQualification() + "'," + dto.isMarried() + "," + dto.isWorking() + ",'"
					+ dto.getCompanyName() + "'," + dto.getSalary() + "," + dto.getAge() + "," + dto.getExperience()
					+ ",'" + dto.getLocation() + "','" + dto.getCity() + "','" + dto.getState() + "','"
					+ dto.getCountry() + "'," + dto.getAdharNo() + "," + dto.getBankAcNO() + ")";
			System.out.println(mysqlValues);
			Statement statement = connection.createStatement();
			int execute = statement.executeUpdate(mysqlValues);
			if (execute > 0) {
				System.out.println(execute);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void display() {
		System.out.println("Displaying All Properties");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Data is Loaded and Registered");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person";

			Statement statement = connection.createStatement();
			System.out.println(mysql);
			ResultSet result = statement.executeQuery(mysql);
			while (result.next()) {
				int id = result.getInt(1);// id
				String name = result.getString(2);// name
				String email = result.getString(3);
				long mobileno = result.getLong(4);//
				String gender = result.getString(5);
				String qualification = result.getString(6);
				boolean married = result.getBoolean(7);
				boolean work = result.getBoolean(8);
				String company = result.getString(9);
				double salary = result.getDouble(10);
				int age = result.getInt(11);
				int exp = result.getInt(12);
				String location = result.getString(13);
				String city = result.getString(14);
				String state = result.getString(15);
				String country = result.getString(16);
				long adharNo = result.getLong(17);
				long bankNo = result.getLong(18);
				System.out.println(id + " " + name + " " + email + " " + mobileno + " " + gender + "" + qualification
						+ "" + married + "" + work + "" + company + "" + salary + "" + age + "" + exp + "" + location
						+ "" + city + "" + state + "" + country + "" + adharNo + "" + bankNo);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person where age>=" + age + " order by name";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String name = resultSet.getString(2);
				int age1 = resultSet.getInt(10);
				System.out.println(name + "" + age1);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from person where gender='" + gender + "' order by name desc";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String gender1 = resultSet.getString(5);
				String name = resultSet.getString(2);

				System.out.println(name + " " + gender1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person where salary>=" + salary + " order by salary desc";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String name = resultSet.getString(2);
				double salary1 = resultSet.getDouble(9);

				System.out.println(name + "" + salary1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayCount() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select count(*) from xworkzbtm.person";
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery(mysql);
			while (resultSet.next()) {

				int id = resultSet.getInt(1);
				System.out.println("total counts id" + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select sum(salary) from xworkzbtm.person";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				double salary = resultSet.getDouble(10);
				System.out.println("Total salary is :" + salary);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
