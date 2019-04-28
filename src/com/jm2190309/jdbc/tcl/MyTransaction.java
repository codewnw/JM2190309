package com.jm2190309.jdbc.tcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyTransaction {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();

			stmt.executeUpdate("INSERT INTO JM2190309_USER VALUES('Junk', 10000)");
			stmt.executeUpdate("UPDATE JM2190309_USER SET AGE = 99 WHERE NAME = 'Rohit'");
			stmt.executeUpdate("DELETE FROM JM2190309_USER WHERE NAME = 'Kamlesh'");

			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190309_USER");
			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				System.out.println(name + " " + age);
			}
//			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
