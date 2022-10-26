package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.HospitalDTO;

public class HospitalRepositoryImp implements HospitalRepository {

	public HospitalRepositoryImp() {

		System.out.println("Hospital Default Constructor:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Hospital Data is saved :" + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// loading driver
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysqlValues = "insert into xworkzbtm.hospital values(" + dto.getId() + ",'" + dto.getName() + "',"
					+ "'" + dto.getSpecialist() + "','" + dto.getFounder() + "'," + dto.getSince() + ")";
			System.out.println(mysqlValues);
			Statement st = connection.createStatement();
			int execute = st.executeUpdate(mysqlValues);
			if (execute > 0) {
				System.out.println(execute);
			return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
