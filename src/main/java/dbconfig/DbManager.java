package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
 private Connection connection=null;
 public Connection mySqlConnect() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwithsession","root","password");
		System.out.println("connected");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
  catch (SQLException e) {
	e.printStackTrace();
  }	
	return connection;
} 
}

