package com.qa.main;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

			DBConnector dbQuery = new DBConnector();
			
			String action = "";
			action = getAction();
			
			switch(action) {
		
			case "create":
				System.out.println("Enter first name you wish to create");
				String fname = scanner.nextLine();
				System.out.println("Enter last name you wish to create");
				String lname = scanner.nextLine();
				dbQuery.createPerson(fname, lname);
				
				dbQuery.readPeople();
				System.out.println(" ");
			
				break;
				
			case "read":
				System.out.println("Data that already exists:");
				dbQuery.readPeople();
				
				System.out.println(" ");
				
				break;
				
			case "readone":
				System.out.println("Please input an id");
				int id3 = scanner.nextInt();
				scanner.nextLine();
				dbQuery.readOne(id3);
				break;
				
			case "update":
				dbQuery.readPeople();
				
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
				dbQuery.readPeople();
				
				System.out.println("Please enter and id");
				int id2 = scanner.nextInt();
				scanner.nextLine();
				dbQuery.deletePerson(id2);
				
				dbQuery.readPeople();
				System.out.println(" ");
				
				break;
				
			default:
				System.out.println("Nothing found matches your selection!");
				System.out.println(" ");
				getAction();
				break;
			}
			
	}

	private static String getAction() {
		System.out.println("What do you want to do?\nPlease type in:\nCreate\nRead\nUpdate\nDelete");
		return scanner.nextLine().toLowerCase();
	}

}
