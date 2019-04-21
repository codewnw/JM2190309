package com.jm2190309.jdbc.dml.pstmt.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordUsingPstmt {

	public static void main(String[] args) {
		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			PreparedStatement stmt = con.prepareStatement("INSERT INTO JM2190309_USER VALUES('Sachin', 10)");
			// 3. Execute the command
			int i = stmt.executeUpdate();
			// 4. Process the result
			if (i > 0) {
				System.out.println("Record has been inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
