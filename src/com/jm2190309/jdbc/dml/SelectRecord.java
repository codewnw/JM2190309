package com.jm2190309.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) {

		try {
//			1. create connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
//			2. Create statement
			Statement stmt = con.createStatement();
//			3. Execute statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190309_USER");
//			4. Processing the result
			while (rs.next()) {
				System.out.println("Data is there");
				String name = rs.getString(1);
				int age = rs.getInt(2);
				System.out.println(name + " " + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
