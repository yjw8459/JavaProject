package SQLiteTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteTest {
public static void main(String[] args) {
	try {
		Class.forName("org.sqlite.JDBC");
		//Referenced.Libraries에 org.sqlite패키지의 JDBC.class
		//이 라이브러리를 사용한다(등록,연결)
		
			Connection conn = 
					DriverManager.getConnection
					("jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db");
			///Users/yjw8459/Desktop/에이콘아카데미/DB.db
			
			
			Statement stmt = conn.createStatement();
			
			final String sql = "SELECT * "+ //띄어쓰기 중요
								"FROM student";
			stmt.executeQuery(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"/t");
				System.out.println(rs.getString("resident_id"));
				System.out.println(rs.getInt("year"));
				System.out.println(rs.getString("dept_id"));
				
			}
					rs.close();
					stmt.close();
					conn.close(); //역순으로 정리
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	catch (ClassNotFoundException e) {
		e.printStackTrace();
		//클래스를 찾지 못할 시 오류 표시
	}
	System.out.println("Connect!!!");
}
}
