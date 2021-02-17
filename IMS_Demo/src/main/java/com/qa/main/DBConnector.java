package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			//without prepared statements
			
//			String sql = String.format("INSERT INTO customers (`first_name`, `surname`) VALUES ('%S', '%s');", fname, lname);
//			statement.executeUpdate(sql);
			
			String sql = "INSERT INTO customers (`first_name`, `surname`) VALUES (?, ?);";

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,  fname);
			ps.setString(2,  lname);
			ps.execute();
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
			//without prepared statements
			
//			String sql = String.format("UPDATE customers SET `first_name` = '%s', `surname`='%s' WHERE id='%d';", 
//					fname, lname, id);
//			statement.executeUpdate(sql);
			
			String sql = "UPDATE customers SET `first_name` = '%s', `surname`='%s' WHERE id='%d';";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2,  fname);
			ps.setString(3,  lname);
			ps.execute();
		}
		
		//DELETE
		public void deletePerson(int id) throws SQLException{
			//without prepared statements
			
//			String sql = String.format("DELETE FROM customers WHERE id = '%d';", id);
//			statement.executeUpdate(sql);
			
			String sql = "DELETE FROM customers WHERE id = '%d';";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			
		}

		public void tearDown() throws SQLException{
			connection.close();
			
		}
		
		
		
		
}
