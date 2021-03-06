package com.jm2190309.jdbc.dml.pstmt.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsUsingPstmtAndBatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = "Y";

		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190309_USER VALUES(?, ?)");

			while (choice.equals("Y")) {
				System.out.print("Please enter name: ");
				String name = scanner.nextLine();

				System.out.print("Please enter age: ");
				int age = Integer.parseInt(scanner.nextLine());

				// 2.1 Set value in first question mark
				pstmt.setString(1, name);
				// 2.2 Set value in second question mark
				pstmt.setInt(2, age);

				// Add into the batch
				pstmt.addBatch();

				System.out.print("Do you wish to continue(Y/N): ");
				choice = scanner.nextLine();
			}

			// 3. Execute the command
			int[] arr = pstmt.executeBatch();

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
