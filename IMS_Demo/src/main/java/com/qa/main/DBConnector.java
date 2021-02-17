package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.util.DatabaseConfig;

public class DBConnector {

		private Statement statement;
		private Connection connection;
		
		public DBConnector() throws SQLException {
			
			// This is going to open our connection!
			// (jdbc:mysql:localhost;etc, root, root)
			connection = DriverManager.getConnection(DatabaseConfig.URL, DatabaseConfig.USER, DatabaseConfig.PASSWORD);
			this.statement = connection.createStatement();
			// statements.executeUpdate("string of sql");
			// statements.executeQUery(sql);
			
		}
		
		//CREATE
		public void createPerson(String fname, String lname) throws SQLException {
			String sql = String.format("INSERT INTO customers (`first_name`, `surname`) VALUES ('%S', '%s';", fname, lname);
			statement.executeUpdate(sql);
			
		}
		
		//READ
		public void readPeople() throws SQLException {
			String sql = "SELECT * FROM customers";
			ResultSet resultset = statement.executeQuery(sql);
					
			while(resultset.next()) {
				System.out.println(String.format("ID: %d,\nFirstname: %s,\nLastname: %s\n", resultset.getInt("id"),
						resultset.getString("first_name"), resultset.getString("surname")));
			}
		}
		
		//READ ONE
		public void readOne(int id) throws SQLException{
			String sql = "SELECT * FROM customers WHERE id = " + id;
			ResultSet resultset = statement.executeQuery(sql);
			
			if (!resultset.next()) {
				System.out.println("No matches found");
			}else {
				do {
					System.out.println(resultset.getString("first_name") + " " + resultset.getString("surname"));
				}while(resultset.next());
			}
		}
		
		//UPDATE
		public void updatePerson(int id, String fname, String lname) throws SQLException {
			String sql = String.format("UPDATE customers SET `first_name` = '%s, `surname`='%s' WHERE id='%d';", 
					fname, lname, id);
			statement.executeUpdate(sql);
			
		}
		
		//DELETE
		public void deletePerson(int id) throws SQLException{
			String sql = String.format("DELETE FROM customers WHERE id = '%d';", id);
			statement.executeUpdate(sql);
			
		}
		
		
		
		
}
