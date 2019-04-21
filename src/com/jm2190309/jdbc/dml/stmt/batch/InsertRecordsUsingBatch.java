package com.jm2190309.jdbc.dml.stmt.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordsUsingBatch {

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

				// 2.1 Add into the batch
				stmt.addBatch("INSERT INTO JM2190309_USER VALUES('" + name + "', " + age + ")");

				System.out.print("Do you wish to continue(Y/N): ");
				choice = scanner.nextLine();
			}

			// 3. Execute the command
			int[] arr = stmt.executeBatch();

			// 4. Process the result
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > 0) {
					System.out.println("Record has been inserted successfully.");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
