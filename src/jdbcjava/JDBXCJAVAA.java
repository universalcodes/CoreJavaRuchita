package jdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBXCJAVAA {
	
	static String dbconnectorpath = "com.mysql.jdbc.Driver";
	static String dbpath = "jdbc:mysql://localhost:3306/finaldb2"; 	//	https://www.google/com/youtube
	static String dbusername = "root";
	static String password = "25111993";
	static String excutedcmd = "SELECT * FROM finaldb2.finalbatch555;";
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection storeconnection = DriverManager.getConnection(dbpath, dbusername, password);
		Statement storestmt = storeconnection.createStatement();
	ResultSet storeresult=	storestmt.executeQuery(excutedcmd);
	storeresult.next();  //1
	storeresult.next();//2
	storeresult.next();//2
x`
	while(storeresult.next())
	{
		String name = 	storeresult.getNString(1);
		int age  = 	storeresult.getInt(2);
		String address = 	storeresult.getString(3);

		long mob = 	storeresult.getLong(4);
		
		System.out.println(name+"\t"+age+ "\t"+address+ "\t"+mob);
		

	}
	
	}
}
