package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.SuperMarketDTO;

public class SuperMarketRepositoryImp implements SuperMarketRepository {

	public SuperMarketRepositoryImp() {
		System.out.println("Saving SuperMarketRepositoryImp default Constr..." + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(SuperMarketDTO dto) {
		System.out.println("Runing Repostioryy	 SuperMarket ");
		try (Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
				JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());)
		{
			Class.forName(JDBCContainer.Driver.getContainer());
			String mysql = "insert into xworkzbtm.supermarket values(?,?,?,?,?);";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setInt(1, dto.getId());
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getCompany());
			preparedStatement.setLong(4, dto.getGstNo());
			preparedStatement.setString(5, dto.getType());
			int execute = preparedStatement.executeUpdate();
			if (execute > 0) {
				System.out.println("execute Statement Done");
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return true;
	}

	@Override
	public void displayByName(String name) {

		try {
			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.supermarket where name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setString(2, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
//				displayResult(resultSet);
				displayResult(resultSet);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private void displayResult(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt(1);
		String nm = resultSet.getString(2);
		String comp = resultSet.getString(3);
		long gstNo = resultSet.getLong(4);
		String type = resultSet.getString(5);
		System.out.println(id);
		System.out.println(nm);
		System.out.println(comp);
		System.out.println(gstNo);
		System.out.println(type);
	}

	@Override
	public boolean save(List<SuperMarketDTO> list) {
		System.out.println("Saving Method by using List" + list);
		try {
			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "insert into supermarket values(?,?,?,?,?,?)";
			PreparedStatement pstatment = connection.prepareStatement(mysql);

			for (SuperMarketDTO smd : list) {
				pstatment.setInt(1, smd.getId());
				pstatment.setString(2, smd.getName());
				pstatment.setString(3, smd.getCompany());
				pstatment.setLong(4, smd.getGstNo());
				pstatment.setString(5, smd.getType());

				int execute = pstatment.executeUpdate();
				if (execute > 0) {
					System.out.println(execute);
				}

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public SuperMarketDTO findByName(String name) {

		try {
			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from supermarket where name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			SuperMarketDTO dto = new SuperMarketDTO();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String company = resultSet.getString(3);
				long gstNo = resultSet.getLong(4);
				String type = resultSet.getString(5);

				dto.getId();
				dto.getName();
				dto.getCompany();
				dto.getGstNo();
				dto.getType();

				return dto;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SuperMarketDTO findById(int id) {
		try {
			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from supermarket where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			SuperMarketDTO dto = new SuperMarketDTO();
			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String company = resultSet.getString(3);
				long gstNo = resultSet.getLong(4);
				String type = resultSet.getString(5);

				dto.setId(id1);
				;
				dto.setName(name1);
				dto.setCompany(company);
				dto.setGstNo(gstNo);
				dto.setType(type);

				return dto;
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SuperMarketDTO> findAll() {

		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();

			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from supermarket";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String company = resultSet.getString(3);
				long gstNo = resultSet.getLong(4);
				String type = resultSet.getString(5);

				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				;
				dto.setName(name1);
				dto.setCompany(company);
				dto.setGstNo(gstNo);
				dto.setType(type);

				dtos.add(dto);

				return dtos;

			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<SuperMarketDTO> findByType(String type) {

		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();

			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from supermarket where type=?";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setString(5, type);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String company = resultSet.getString(3);
				long gstNo = resultSet.getLong(4);
				String type1 = resultSet.getString(5);

				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				dto.setName(name1);
				dto.setCompany(company);
				dto.setGstNo(gstNo);
				dto.setType(type1);

				dtos.add(dto);

				return dtos;

			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<SuperMarketDTO> findByGstNoAndType(String type, int gstNo) {

		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();

			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from supermarket where gstNo=? && type=?";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			preparedStatement.setLong(4, gstNo);
			preparedStatement.setString(5, type);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String company = resultSet.getString(3);
				long gstNo1 = resultSet.getLong(4);
				String type2 = resultSet.getString(5);

				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				;
				dto.setName(name1);
				dto.setCompany(company);
				dto.setGstNo(gstNo1);
				dto.setType(type2);

				dtos.add(dto);

				return dtos;

			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int totalCount() {

		try {
			Class.forName(JDBCContainer.Driver.getContainer());
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select count(*) from supermarket";
			PreparedStatement preparedStatement = connection.prepareStatement(mysql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int count = resultSet.getInt(1);
				System.out.println(count);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
