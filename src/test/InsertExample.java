package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");// creating connection object.// creating connection to server udsing driver manager.getconnection();.

		Statement stmt = con.createStatement();// creating a class called  statement to execute quires.
		
		stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Television', 6000.00, now())");// to update values to the table.
		
		System.out.println("The row is inserted");
		
		ResultSet result = stmt.executeQuery("select * from eproduct");//using resultset we can iterate all the rows.

		while (result.next()) {

			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
		}
		
		con.close();



	}

}
