package com.jm2190309.jdbc.dml.stmt.many;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = "Y";

		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			Statement stmt = con.createStatement();

			while (choice.equals("Y")) {
				System.out.print("Please enter name: ");
				String name = scanner.nextLine();

				System.out.print("Please enter age: ");
				int age = Integer.parseInt(scanner.nextLine());

				// 3. Execute the command
				int i = stmt.executeUpdate("INSERT INTO JM2190309_USER VALUES('" + name + "', " + age + ")");

				// 4. Process the result
				if (i > 0) {
					System.out.println("Record has been inserted successfully.");
				}

				System.out.print("Do you wish to continue(Y/N): ");
				choice = scanner.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
