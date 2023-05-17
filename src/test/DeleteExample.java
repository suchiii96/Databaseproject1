package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {// classnot foundexception=incase if you forgot to add the jarfile,this exception will show.
                                                                                        //sqlexception=in case if sql is stopped during your program execiution ,this will throw.		
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");// creating connection object.// creating connection to server udsing driver manager.getconnection();.

		Statement stmt = con.createStatement();// creating a class called  statement to execute quires.
		
		stmt.executeUpdate("delete from eproduct where name='Television';");
				

		
		System.out.println("product deleted");
		
		ResultSet result = stmt.executeQuery("select * from eproduct");//using resultset we can iterate all the rows.

		while (result.next()) {

			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
			System.out.println("Product price " + result.getDouble("price"));
		}
		
		con.close();


	}

}
