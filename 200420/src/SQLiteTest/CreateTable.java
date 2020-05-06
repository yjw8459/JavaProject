package SQLiteTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	final static String DRIVER = "org.sqlite.JDBC";
	final static String DB = 
			"jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db";
	final static String CREATETABLESQL =
			"CREATE TABLE login2(" +
			"id varchar2(20) not null PRIMARY KEY,"+
					"pw varchar(30) not null"+			
			")";
	//코드로 테이블 만드는 방법
			

public static void main(String[] args) {
	try {
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(DB);
		Statement stmt = conn.createStatement();
		
		stmt.execute(CREATETABLESQL);
		
		
		
		stmt.close();
		conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
}
}
