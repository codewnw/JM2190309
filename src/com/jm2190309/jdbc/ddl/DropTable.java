package com.jm2190309.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {
		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			Statement stmt = con.createStatement();
			// 3. Execute the command
			boolean result = stmt.execute("DROP TABLE JM2190309_DUMMY");
			// 4. Process the result
			if (!result) {
				System.out.println("Table dropped successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
