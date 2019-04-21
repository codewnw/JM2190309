package com.jm2190309.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowDataBaseMetaData {

	public static void main(String[] args) {

		try {
//			1. create connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			ResultSet rs = dbmd.getTables(null, null, "JM2%", null);
			while(rs.next()) {
				String tableName = rs.getString(3);
				System.out.println(tableName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
