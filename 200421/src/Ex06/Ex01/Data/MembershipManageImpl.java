package Ex06.Ex01.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ex06.Ex01Login.Member;

public class MembershipManageImpl implements IMembershipManage{
	final static String DRIVER="org.sqlite.JDBC";
	final static String DB = 
			"jdbc:sqlite:/Users/yjw8459/Desktop/에이콘아카데미/DB.db";
	Connection conn;
	public MembershipManageImpl() {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(DB);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean MembershipProc(Member member) {
		
		
		
	}
	@Override
	public int LoginProc(String id, String pw) {
		String sql = "SELECT count(*) "
				+ "FROM member "
				+ "WHERE id=? "
				+ "AND pw=?";
		int result = 0;
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setString(1,  id);
			pStmt.setString(1,  pw);
		
			
			ResultSet rs = pStmt.executeQuery(); // executeUpdate();
			if(rs.next())
				result = rs.getInt("count(*)");
			
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//return false;
		}
		
		
		return result;
	}

}
