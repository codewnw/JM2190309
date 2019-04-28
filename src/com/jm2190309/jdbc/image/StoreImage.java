package com.jm2190309.jdbc.image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190309_PROFILE VALUES(?, ?)");

			FileInputStream fis = new FileInputStream("images//tech-word-cloud.jpg");
			pstmt.setString(1, "Tech");
			pstmt.setBinaryStream(2, fis, fis.available());

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Image has been inserted successfully.");
			}
			fis.close();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
