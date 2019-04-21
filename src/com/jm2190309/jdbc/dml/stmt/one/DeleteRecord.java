package com.jm2190309.jdbc.dml.stmt.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			Statement stmt = con.createStatement();
			// 3. Execute the command
			int i = stmt.executeUpdate("DELETE FROM JM2190309_USER WHERE NAME = 'Rohit'");
			// 4. Process the result
			if (i > 0) {
				System.out.println("Record has been deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
