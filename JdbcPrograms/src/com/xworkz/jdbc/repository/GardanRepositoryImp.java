package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.GardanDTO;

public class GardanRepositoryImp implements GardanRepository {

	public GardanRepositoryImp() {
		System.out.println("Creating GardanRepositoryImp Defalut constructor.." + getClass().getSimpleName());

	}

	@Override
	public boolean Save(GardanDTO dto) {
		System.out.println("Saving GardenDTO" + dto);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysqlValue = "insert into xworkzbtm.garden values('" + dto.getName() + "','" + dto.getArea() + "',"
					+ dto.getTotalTree() + "," + dto.getTotalBeanch() + ")";
			System.out.println(mysqlValue);
			Statement statement = connection.createStatement();
			int execute = statement.executeUpdate(mysqlValue);
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
