package com.qa.main;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		DBConnector dbQuery = new DBConnector();

		String action = "";
		action = getAction();

		while (true) {
			switch (action) {

			case "create":
				System.out.println("Enter first name you wish to create");
				String fname = scanner.nextLine();
				System.out.println("Enter last name you wish to create");
				String lname = scanner.nextLine();
				dbQuery.createPerson(fname, lname);

				dbQuery.readPeople();

				break;

			case "read":
				System.out.println("Data that already exists:");
				dbQuery.readPeople();

				break;

			case "readone":
				System.out.println("Please input an id");
				int id3 = scanner.nextInt();
				scanner.nextLine();
				dbQuery.readOne(id3);
				break;

			case "update":

				System.out.println("Enter the id of the person you wish to change");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the new first name");
				String fname2 = scanner.nextLine();
				System.out.println("Enter the new last name");
				String lname2 = scanner.nextLine();
				dbQuery.updatePerson(id, fname2, lname2);

				dbQuery.readPeople();
				break;

			case "delete":

				System.out.println("Please enter and id");
				int id2 = scanner.nextInt();
				scanner.nextLine();
				dbQuery.deletePerson(id2);

				dbQuery.readPeople();
				break;

			case "exit":
				System.out.println("Bye...");
				dbQuery.tearDown();
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Nothing found matches your selection!");
				System.out.println(" ");

				break;

			}
			action = getAction();
		}

	}

	private static String getAction() {
		System.out.println("What do you want to do?\nPlease type in:\nCreate\nRead\nReadOne\nUpdate\nDelete");
		return scanner.nextLine().toLowerCase();
	}

}
