package com.jm2190309.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowResultSetMetaData {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190309_USER");
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total Columns: " + rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1) + "(" + rsmd.getColumnTypeName(1) + ")" + "  "
					+ rsmd.getColumnName(2) + "(" + rsmd.getColumnTypeName(2) + ")");

			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				System.out.println(name + " " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
