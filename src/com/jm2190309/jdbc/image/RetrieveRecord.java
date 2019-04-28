package com.jm2190309.jdbc.image;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveRecord {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190309_PROFILE WHERE NAME = 'Tech'");
			rs.next();

			String name = rs.getString(1);
			Blob b = rs.getBlob(2);
			byte[] picAsByte = b.getBytes(1, (int) b.length());

			FileOutputStream fos = new FileOutputStream("images//output.jpg");
			fos.write(picAsByte);
			
			fos.close();
			
			System.out.println(name);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
