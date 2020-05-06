package SQLiteTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	final static String DRIVER = "org.sqlite.JDBC";
	final static String DB = 
			"jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db";
	final static String SQL = "INSERT INTO student "
			+ "VALUES(?,?,?,?) ;";
			
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("학번을 입력하세요 : ");
	String stu_id = in.next();
	System.out.println("생년월일을 입력하세요 : ");
	String resident_id = in.next();
	System.out.println("학년을 입력하세요 : ");
	int year = in.nextInt();
	System.out.println("학과를 입력하세요 : ");
	String dept_id = in.next();
	
	try {
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(DB);
		PreparedStatement pStmt = conn.prepareStatement(SQL);
		
		pStmt.setString(1, stu_id);
		pStmt.setString(2, resident_id);
		pStmt.setInt(3, year);
		pStmt.setString(4, dept_id);
		
		pStmt.executeUpdate();
		
		pStmt.close();
		conn.close();
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
