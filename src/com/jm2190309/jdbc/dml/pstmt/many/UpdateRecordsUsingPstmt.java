package com.jm2190309.jdbc.dml.pstmt.many;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordsUsingPstmt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = "Y";

		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2190309_USER SET AGE = ? WHERE NAME = ?");

			while (choice.equals("Y")) {
				System.out.print("Please enter name: ");
				String name = scanner.nextLine();

				System.out.print("Please enter new age: ");
				int age = Integer.parseInt(scanner.nextLine());

				// 2.1 Set value in first question mark
				pstmt.setString(2, name);
				// 2.2 Set value in second question mark
				pstmt.setInt(1, age);

				// 3. Execute the command
				int i = pstmt.executeUpdate();

				// 4. Process the result
				if (i > 0) {
					System.out.println("Record has been updated successfully.");
				}

				System.out.print("Do you wish to continue(Y/N): ");
				choice = scanner.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
