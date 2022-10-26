package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.GarageDTO;

public class GarageRepositoryImp implements GarageRepository {

	public GarageRepositoryImp() {

		System.out.println("Garage Repository Default constrctor...:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Garage Repository saved" + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "Insert into xworkzbtm.garage values('" + dto.getName() + "','" + dto.getLocation() + "','"
					+ dto.getType() + "'," + dto.getCost() + ")";
			System.out.println(mysql);
			Statement statement = connection.createStatement();
			int exicute = statement.executeUpdate(mysql);
			if (exicute > 0) {
				System.out.println(exicute);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

}
