package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {

	public PropertyRepositoryImpl() {  

		System.out.println("PropertyRepository default constructor...:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Property data is saved" + dto);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connectin = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysqlValues = "insert into xworkzbtm.property values(" + dto.getSiteNo() + ",'" + dto.getOwner()
					+ "','" + dto.getArea() + "'," + dto.getCost() + ")";
			System.out.println(mysqlValues);
			Statement statement = connectin.createStatement();
			int execute = statement.executeUpdate(mysqlValues);
			if (execute > 0) {
				System.out.println(execute);
			}
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
