package SQLiteTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx02 {
	final static String DRIVER = "org.sqlite.JDBC";
	final static String DB = 
			"jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db";
	final static String CREATETABLESQL =
			"CREATE TABLE login(" +
			"id varchar2(20) not null PRIMARY KEY,"+
					"pw varchar(30) not null"+			
			")";
	//코드로 테이블 만드는 방법
	
	 final static String INSERT = " INSERT INTO login2 values('din','jin1234');";
	 final static String UPDATESQL = "UPDATE login2 "
	 		+ "SET pw = 'din1234' WHERE id = 'din'";
			

public static void main(String[] args) {
	try {
		Class.forName(DRIVER); //접속 클래스 이름 
		Connection conn = DriverManager.getConnection(DB);
		//DB 경로로 연결 Connection 
		Statement stmt = conn.createStatement();
		
		stmt.execute(UPDATESQL);
		//stmt.execute(INSERT);
		
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
