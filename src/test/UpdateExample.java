package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");// creating connection object.// creating connection to server udsing driver manager.getconnection();.

		Statement stmt = con.createStatement();// creating a class called  statement to execute quires.
		
		stmt.executeUpdate("update eproduct set price=6500.00 where name='Tablet';");

		
		System.out.println("The value is updated");
		
		ResultSet result = stmt.executeQuery("select * from eproduct");//using resultset we can iterate all the rows.

		while (result.next()) {

			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
			System.out.println("Product price " + result.getDouble("price"));
		}
		
		con.close();


	}

}
