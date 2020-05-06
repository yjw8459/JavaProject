package SQLiteTest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {final static String DRIVER = "org.sqlite.JDBC";
final static String DB = 
"jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db";
final static String CREATETABLESQL =
"CREATE TABLE login(" +
"id varchar2(20) not null PRIMARY KEY,"+
		"pw varchar(30) not null"+			
")";
//코드로 테이블 만드는 방법
final static String SQL = "SELECT count(*)"
		+ "FROM student "
		+ "WHERE year = ?";
final static int ZEROASCII = 48; // 0의 아스키코드는 48


public static void main(String[] args) {
	System.out.println("학년을 입력하세요?");
	
	int year=0;
		try {
			year = System.in.read()-ZEROASCII;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//문자를 읽어들이는 코드 아스키코드 
		
		
			try {
				Class.forName(DRIVER);
				Connection conn = DriverManager.getConnection(DB);
				PreparedStatement pStmt = conn.prepareStatement(SQL);
				
				pStmt.setInt(1, year);
				
				ResultSet rs = pStmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("count(*)"));
				}
				rs.close();
				pStmt.close();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
